public class Person {

    private Number id;
    private String name;
    
    public Person (Number id, String name) {
        setID(id);
        setName(name);
    }

    private void setID(Number id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private Number getID() {
        return this.id;
    }

    private String getName() {
        return this.name;
    }    

    public void getPerson() {
        System.out.println("ID: "+ getID());
        System.out.println("Name: "+ getName());
    }

}
