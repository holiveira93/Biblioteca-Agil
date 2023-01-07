import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i, menu;
        boolean sair = false, existe = false;
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        

        livros.add(new Livro(1, "Como fazer sentido e bater o martelo",
                "Alexandro Aolchique", "2017", "Disponivel", "-----"));

        livros.add(new Livro(2, "Sejamos todos feministas",
                "Chimamanda Ngozi Adichie", "2015", "Disponivel", "-----"));
        
        livros.add(new Livro(3, "Basquete 101",
                "Hortência Marcari", "2017", "Disponivel", "-----"));
        
        do {
            menu = 0;
            System.out.println("\nEscolha a opção: ");
            System.out.println("1 - Listar todos livros");
            System.out.println("2 - Retirar um livro");
            System.out.println("3 - Devolver um livro");
            System.out.println("4 - Doar um livro");
            System.out.println("5 - Sair");
            System.out.printf(">> ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n----------Livros----------");
                    for (i = 0; i < livros.size(); i++) {
                        livros.get(i).info();
                        System.out.println("-------------------------------");
                    }
                break;

                case 2:
                    existe = false;
                    System.out.println("\nDigite o numero do livro a ser retirado ou '0' para retornar: ");
                    System.out.printf(">> ");
                    int escolha = scan.nextInt();
                    scan.nextLine();
                    if(escolha == 0){
                        break;
                    }

                    for (i = 0; i < livros.size(); i++) {
                        if (livros.get(i).getNumero() == escolha) {
                            livros.get(i).info();
                            livros.get(i).retirar();
                            existe = true;
                            break;
                        }
                    }
                    if(!existe){
                        System.out.println("Este numero de livro não está cadastrado");
                    }
                break;

                case 3:
                    System.out.println("Informe o numero do livro a ser devolvido ou '0' para retornar: ");
                    System.out.printf(">> ");
                    escolha = scan.nextInt();

                    if(escolha == 0){
                        break;
                    }

                    for (i = 0; i < livros.size(); i++) {
                        if (livros.get(i).getNumero() == escolha) {
                            livros.get(i).info();
                            livros.get(i).devolver();
                            existe = true;
                            break;
                        }
                    }
                    if(!existe){
                        System.out.println("Este numero de livro não está cadastrado");
                    }
                break;

                case 4:
                    boolean igual = false;

                    System.out.println("cadastre as informações do novo livro: ");
                    System.out.println("\nNumero: ");
                    System.out.printf(">> ");
                    int novoNumero = scan.nextInt();
                    scan.nextLine();

                    for (i = 0; i<livros.size(); i++) {
                        if (novoNumero == livros.get(i).getNumero()) {
                            System.out.println("ERRO - Numero já possui cadastro");
                            igual = true;
                            break;
                        }
                    }
                    if (!igual) {
                        livros.add(new Livro());
                        livros.get(livros.size()-1).cadastrar(novoNumero);
                    }
                break;

                case 5:
                    sair = true;
                break;

                default:
                    System.out.println("\nOpção inválida, escolha novamente!");
                break;
            }
        } while (!sair);
        scan.close();
    }
}
