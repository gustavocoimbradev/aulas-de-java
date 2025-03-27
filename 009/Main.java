class Main {
    
    public static void main(String[] args) {
        
        Carro carro             = new Carro("AAA-0000","Chevrolet","Corsa","Preto");
        Motorista motorista     = new Motorista("Gabriel", "00000000000", carro);
        Passageiro passageiro   = new Passageiro("Gustavo", "PIX");
        Corrida corrida         = new Corrida(motorista, passageiro);
        corrida.iniciarCorrida("11:00");
        corrida.finalizarCorrida("10:30");
        
    }
    
}