class Pessoa {
    
    private String nome;
    private Number idade;
    private String sexo;
    
    Pessoa(String nome, Number idade, String sexo) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }
    
    protected void setNome(String nome) {
        this.nome = nome;
    }
    
    protected String getNome() {
        return this.nome;
    }
    
    protected void setIdade(Number idade) {
        this.idade = idade;
    }
    
    protected Number getIdade() {
        return this.idade;
    }
    
    protected void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    protected String getSexo() {
        return this.sexo;
    }
    
}