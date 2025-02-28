public class Usuario {

    private int id;
    private String nome;
    private int[] livros;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLivros(int[] livros) {
        this.livros = livros;
    }

    public int getId() {
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public int[] getLivros(){
        return this.livros;
    }

    public void Criar() {
        System.out.println("Usuário criado com sucesso!");
    }

    public void Atualizar() {
        System.out.println("Usuário atualizado com sucesso!");
    }

    public void Excluir(int id) {
        System.out.println("Usuário excluido com sucesso!");
    }
 
}
