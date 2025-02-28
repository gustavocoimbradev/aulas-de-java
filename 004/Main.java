public class Main {

    public static void main(String[] args) {

        /**
         * USUÁRIO
         */

        // Cria o objeto
        Usuario usuario = new Usuario();

        // Define os valores
        usuario.setId(0);
        usuario.setNome("John W");
        usuario.setLivros(new Number[]{});
        usuario.criar();

        // Atualiza as informações já cadastradas
        usuario.setNome("John Winchester");
        usuario.atualizar();

        // Exclui o usuário
        usuario.excluir();

        /**
         * LIVRO
         */

        // Cria o objeto
        Livro livro = new Livro();

        // Define os valores
        livro.setId(0);
        livro.setTitulo("A revolução dos bicho");
        livro.setAutor("George_Orwell");
        livro.setPaginas(208);
        livro.setAno(2022);
        livro.setDisponivel(true);
        livro.criar();

        // Atualiza as informações já cadastradas
        livro.setAutor("George Orwell");
        livro.atualizar();

        // Exclui o livro
        livro.excluir();

        /**
         * Empréstimo
         */

        // Cria o objeto
        Emprestimo emprestimo = new Emprestimo();

        // Define os valores
        emprestimo.setLivro(0);
        emprestimo.setUsuario(0);
        emprestimo.setDataEmprestimo("02/02/2025");
        emprestimo.setDataDevolucao("05/02/2025");

        // Atualiza as informações já cadastradas
        emprestimo.setDataDevolucao("04/02/2025");
        emprestimo.atualizar();

        // Exclui o emprestimo
        emprestimo.excluir();

    }

}
