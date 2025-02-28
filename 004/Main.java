public class Main {

    public static void main(String[] args) {

        // Cadastra livro
        Livro livro = new Livro(1, "Título", "Autor", 2010, 256, true);
        System.out.println("Livro cadastrado com sucesso!");

        // Cadastra usuário
        Usuario usuario = new Usuario(1, "Gustavo", new Number[]{});
        System.out.println("Usuário cadastrado com sucesso!");

        // Cadastra empréstimo
        Emprestimo emprestimo = new Emprestimo(1,1,"20/02/2025","25/02/2025","25/02/2025");
        usuario.setLivros(new Number[]{1});
        System.out.println("Empréstimo cadastrado com sucesso!");

    }

}
