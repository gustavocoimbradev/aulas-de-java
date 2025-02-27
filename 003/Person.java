public class Person {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public void save() {
        if (this.isAdult()) {
            System.out.println("Person successfuly created");
        } else {
            System.out.println("Age must be major than 18");
        }
    }

}