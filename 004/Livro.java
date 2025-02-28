public class Livro {

    public Number id;
    public String titulo;
    public String autor;
    public Number ano;
    public Number paginas;
    public Boolean disponivel;

    public Livro(Number id, String titulo, String autor, Number ano, Number paginas, Boolean disponivel) {
        this.id             = id;
        this.titulo         = titulo;
        this.autor          = autor;
        this.ano            = ano;
        this.paginas        = paginas;
        this.disponivel     = disponivel;
    }

}