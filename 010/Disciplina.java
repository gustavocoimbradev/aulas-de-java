class Disciplina {
    
    private String nome;
    private Professor professor;
    
    Disciplina(String nome, Professor professor) {
        setNome(nome);
        setProfessor(professor);
    }
    
    private void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    private Professor getProfessor(){
        return this.professor;
    } 
    
    private void setNome(String nome) {
        this.nome = nome;
    }
    
    private String getNome() {
        return this.nome;
    }
    
}