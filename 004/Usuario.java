public class Usuario {

    public Number id;
    public String nome;
    public Number[] livros;

    public Usuario(Number id, String nome, Number[] livros) {
        this.id         = id;
        this.nome       = nome;
    }

    public void setLivros(Number[] livros) {
        this.livros     = livros;
    }

}
