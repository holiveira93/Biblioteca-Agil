import java.util.Scanner;

public class Livro{
    
    private int numero = 0;
    private String titulo;
    private String autor;
    private String ano;
    private String status;
    private String emprestadoPara;
    Scanner scan = new Scanner(System.in);
    
    public Livro() {
    }

    public Livro(int numero, String titulo, String autor, String ano,
                String status, String emprestadoPara){
        this.numero = numero;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.status = status;
        this.emprestadoPara = emprestadoPara; 
    }

    public void retirar() {
        if (getStatus() == "Disponivel") {
            System.out.println("\nDigite o nome de quem irá retirar: ");
            System.out.printf(">> ");
            setemprestadoPara(scan.nextLine());

            System.out.println("\nLivro retirado com sucesso");
            setStatus("Indisponivel");
        } else {
                System.out.println("\nLivro Indisponivel para retirada");
        }    
    }

    public void devolver(){
        if (getStatus() == "Indisponivel") {
            System.out.println("Livro devolvido com sucesso");
            setStatus("Disponivel");
            setemprestadoPara("-----");
        } else {
            System.out.println("Livro já estava disponivel para retirar");
        }
    }
    
    public void cadastrar(int novoNumero) {
        setNumero(novoNumero);

        System.out.println("Titulo: ");
        System.out.printf(">> ");
        setTitulo(scan.nextLine());

        System.out.println("Autor: ");
        System.out.printf(">> ");
        setAutor(scan.nextLine());

        System.out.println("Ano: ");
        System.out.printf(">> ");
        setAno(scan.next());

        setStatus("Disponivel");
        setemprestadoPara("-----");
        
        System.out.println("\nLivro registrado com sucesso!");
    }
    

    public void info() {
        System.out.println("Numero: " + getNumero());
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAno());
        System.out.println("Status: " + getStatus());
        System.out.println("Esprestado para: " + getemprestadoPara());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getemprestadoPara() {
        return emprestadoPara;
    }

    public void setemprestadoPara(String emprestadoPara) {
        this.emprestadoPara = emprestadoPara;
    }
    
}
