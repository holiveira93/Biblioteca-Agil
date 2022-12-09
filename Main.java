import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i, menu, escolha;
        Livro livro[] = new Livro[10];
        Scanner scan = new Scanner(System.in);

        livro[0] = new Livro(1, "Como fazer sentido e bater o martelo",
                "Alexandro Aolchique", "2017", "Disponivel", "");

        livro[1] = new Livro(2, "Sejamos todos feministas",
                "Chimamanda Ngozi Adichie", "2015", "Disponivel", "");

        livro[2] = new Livro(3, "Basquete 101",
                "Hortência Marcari", "2017", "Disponivel", "");
        
        do {
            menu = 0;

            System.out.println("\nEscolha a opção: ");
            System.out.println("1 - Retirar um livro\n2 - Devolver um livro\n3 - Doar um livro\n4 - Sair");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Livros:");
                    for (i = 0; i != 10; i++) {
                        if (livro[i] != null) {
                            System.out.println("\nNumero: " + livro[i].getNumero());
                            System.out.println("Titulo: " + livro[i].getTitulo());
                        }
                    }

                    System.out.println("\nEscolha o numero do livro a ser retirado: ");
                    escolha = scan.nextInt();

                    for (i = 0; i != 10; i++) {
                        if (livro[i].getNumero() == escolha) {
                            System.out.println("\nNumero: " + livro[i].getNumero());
                            System.out.println("Titulo: " + livro[i].getTitulo());
                            System.out.println("Autor: " + livro[i].getAutor());
                            System.out.println("Ano: " + livro[i].getAno());
                            System.out.println("Status: " + livro[i].getStatus());
                            System.out.println("Esprestado para: " + livro[i].getEmprestado_para());

                            if (livro[i].getStatus() == "Disponivel") {
                                scan.nextLine();
                                System.out.println("\nDigite o nome de quem irá retirar");
                                livro[i].setEmprestado_para(scan.nextLine());

                                System.out.println("\nLivro retirado com sucesso");
                                livro[i].setStatus("Indisponivel");
                            } else {
                                System.out.println("\nLivro Indisponivel para retirada");
                            }
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Informe o numero do livro a ser devolvido: ");
                    escolha = scan.nextInt();

                    for (i = 0; i != 10; i++) {
                        if (livro[i].getNumero() == escolha) {
                            if (livro[i].getStatus() == "Indisponivel") {

                                System.out.println("Livro devolvido com sucesso");
                                livro[i].setStatus("Disponivel");
                                livro[i].setEmprestado_para("");
                            } else {
                                System.out.println("Livro já estava disponivel para retirar");
                            }
                            break;
                        }
                    }
                    break;

                case 3:
                    int numero;
                    boolean igual = false;

                    System.out.println("cadastre as informações do novo livro: ");
                    System.out.println("\nNumero: ");
                    numero = scan.nextInt();

                    for (i = 0; i != 10; i++) {

                        if (livro[i] != null) {
                            if (numero == livro[i].getNumero()) {
                                System.out.println("ERRO - Numero já possui cadastro");
                                igual = true;
                            }
                        }
                    }
                    if (igual == false) {
                        scan.nextLine();
                        System.out.println("Titulo: ");
                        String titulo = scan.nextLine();

                        System.out.println("Autor: ");
                        String autor = scan.nextLine();

                        System.out.println("Ano: ");
                        String ano = scan.next();
                        
                        for (i = 0; i != 10; i++) {
                            if (livro[i] == null) {
                                livro[i] = new Livro(numero, titulo, autor, ano, "Disponivel", "");

                                System.out.println("\nLivro registrado com sucesso!");
                                break;
                            }
                        }
                    }
                break;
            }
        } while (menu != 4);
        scan.close();
    }
}
