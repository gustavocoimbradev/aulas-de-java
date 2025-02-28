public class Emprestimo {
    
    public Number livro;
    public Number usuario;
    public String dataEmprestimo;
    public String dataDevolucaoPrevista;
    public String dataDevolucaoReal;

    public Emprestimo(Number livro, Number usuario, String dataEmprestimo, String dataDevolucaoPrevista, String dataDevolucaoReal) {
        this.livro                  = livro;
        this.usuario                = usuario;
        this.dataEmprestimo         = dataEmprestimo;
        this.dataDevolucaoPrevista  = dataDevolucaoPrevista;
        this.dataDevolucaoReal      = dataDevolucaoReal;
    }


}
