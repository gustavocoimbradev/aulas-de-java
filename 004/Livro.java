public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private int paginas;
    private Boolean disponivel;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAno() {
        return this.ano;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public Boolean getDisponivel() {
        return this.disponivel;
    }

    public void Criar() {
        System.out.println("Livro criado com sucesso!");
    }

    public void Atualizar() {
        System.out.println("Livro atualizado com sucesso!");
    }

    public void Excluir(int id) {
        System.out.println("Livro excluido com sucesso!");
    }

}