public class Livro{
    
    private int numero = 0;
    private String titulo;
    private String autor;
    private String ano;
    private String status;
    private String emprestado_para;
    
    public Livro(int numero, String titulo, String autor, String ano,
            String status, String emprestado_para){
        this.numero = numero;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.status = status;
        this.emprestado_para = emprestado_para; 
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

    public String getEmprestado_para() {
        return emprestado_para;
    }

    public void setEmprestado_para(String emprestado_para) {
        this.emprestado_para = emprestado_para;
    }
    
}
