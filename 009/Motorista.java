class Motorista {
    
    private String nome;
    private String cpf;
    private Carro carro;
    
    Motorista(String nome, String cpf, Carro carro) {
        setNome(nome);
        setCpf(cpf);
        setCarro(carro);
    }
    
    private void setNome(String nome) {
        this.nome = nome;
    }
    
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    private void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    String getNome() {
        return this.nome;
    }
    
    String getCpf() {
        return this.cpf;
    }
    
    Carro getCarro() {
        return this.carro;
    }

    
}