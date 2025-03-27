class Passageiro extends Pessoa {
    
    private String formaPagamento;
    
    Passageiro(String nome, String cpf, String formaPagamento) {
        setNome(nome);
        setFormaPagamento(formaPagamento);
    }
    
    private void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    private String getFormaPagamento() {
        return this.formaPagamento;
    }
    
}