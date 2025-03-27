class Passageiro {
    
    private String nome;
    private String formaPagamento;
    
    Passageiro(String nome, String formaPagamento) {
        setNome(nome);
        setFormaPagamento(formaPagamento);
    }
    
    private void setNome(String nome) {
        this.nome = nome;
    }
    
    private void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    private String getNome() {
        return this.nome;
    }
    
    private String getFormaPagamento() {
        return this.formaPagamento;
    }
    
}