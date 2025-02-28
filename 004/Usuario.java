public class Usuario {

    private int id;
    private String nome;
    private Number[] livros;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLivros(Number[] livros) {
        this.livros = livros;
    }

    public int getId() {
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public Number[] getLivros(){
        return this.livros;
    }

    public void criar() {
        System.out.println("Usuário criado com sucesso!");
    }

    public void atualizar() {
        System.out.println("Usuário atualizado com sucesso!");
    }

    public void excluir() {
        System.out.println("Usuário excluido com sucesso!");
    }
 
}
