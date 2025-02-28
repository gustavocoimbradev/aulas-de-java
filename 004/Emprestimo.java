public class Emprestimo {
    
    private int livro;
    private int usuario;
    private String dataEmprestimo;
    private String dataDevolucao; 

    public void setLivro(int livro) {
        this.livro = livro;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getLivro() {
        return this.livro;
    }

    public int getUsuario() {
        return this.usuario;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void criar() {
        System.out.println("Empréstimo criado com sucesso!");
    }

    public void atualizar() {
        System.out.println("Empréstimo atualizado com sucesso!");
    }

    public void excluir() {
        System.out.println("Empréstimo excluido com sucesso!");
    }

}
