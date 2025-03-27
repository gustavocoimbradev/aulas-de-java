class Main {
    
    public static void main(String[] args) {
        
        Aluno aluno             = new Aluno("Gustavo", 27, "M");
        
        Professor professor     = new Professor("Angelo", 50, "M");
        
        Disciplina disciplina   = new Disciplina("POO", professor);
  
    }
    
}