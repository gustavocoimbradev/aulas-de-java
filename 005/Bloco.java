public class Bloco {

    // Atributos
    private Number id;
    private String name;
    private Boolean deleted;

    // Método construtor
    public Bloco(Number id, String name) {
        Boolean success = newBloco(id, name);
        if (success) {
            System.out.println("O bloco '"+name+"' foi cadastrado com sucesso!");
        } else {
            System.out.println("Ocorreu um erro ao cadastrar o bloco '"+name+"'. Verifique as informações fornecidas e tente novamente.");
        }
    }

    // Métodos setters
    private void setId(Number id) {
        this.id = id;
    }
    private void setName(String name) {
        this.name = name;
    }
    private void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    // Métodos getters
    private Number getId() {
        return this.id;
    }
    private String getName() {
        return this.name;
    }
    private Boolean getDeleted() {
        return this.deleted;
    }

    // Outros métodos
    private Boolean newBloco(Number id, String name) {
        try {
            if (id == null || name == null || name.trim().isEmpty()) {
                return false;
            }
            setId(id);
            setName(name);
            setDeleted(false);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void getBloco() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Deleted: " + this.deleted);
    }
    
}
