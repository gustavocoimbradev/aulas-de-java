class Corrida {
    
    private String inicio;
    private String fim;
    private Motorista motorista;
    private Passageiro passageiro;
    
    Corrida(Motorista motorista, Passageiro passageiro) {
        setInicio(inicio);
        setMotorista(motorista);
        setPassageiro(passageiro);
    }
    
    private void setInicio(String inicio) {
        this.inicio = inicio;
    }
    
    private String getInicio() {
        return this.inicio;
    }
    
    private void setFim(String fim) {
        this.fim = fim;
    }  
        
    private String getFim() {
        return this.fim;
    }
    
    private void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
        
    private Motorista getMotorista() {
        return this.motorista;
    }    
    
    private void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    
    private Passageiro getPassageiro() {
        return this.passageiro;
    }
    
    void iniciarCorrida(String inicio) {
        setInicio(inicio);
    }
    
    void finalizarCorrida(String fim) {
        setFim(fim);
    }
    
}