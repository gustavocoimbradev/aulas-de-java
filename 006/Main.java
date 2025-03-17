class Corda {
     void emitirSom() {
        System.out.println("Mi");    
    }
}

class CordaRe extends Corda {
    void emitirSom() {
        System.out.println("Ré");
    }
}

class Main {
    public static void main(String[] args) {
        Corda corda = new CordaRe();
        corda.emitirSom();
    }
}
