class Carro {
    
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    
    Carro(String placa, String marca, String modelo, String cor) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
    }
    
    private void setPlaca(String placa) {
        this.placa = placa;
    }
    
    private String getPlaca() {
        return this.placa;
    }
    
    private void setMarca(String marca) {
        this.marca = marca;
    }
    
    private String getMarca() {
        return this.marca;
    }
    
    private void setModelo(String modelo) {
        this.modelo = modelo;
    }    
    
    private String getModelo() {
        return this.modelo;
    }
    
    private void setCor(String cor) {
        this.cor = cor;
    }
    
    private String getCor() {
        return this.cor;
    }
    
}