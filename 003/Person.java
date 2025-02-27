public class Person {

    private String name;
    private int age;
    private boolean isRegistered;

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

    public boolean save() {
        if (this.isAdult()) {
            this.isRegistered = true;
            System.out.println("Person successfully registered");
        } else {
            this.isRegistered = false;
            System.err.println("Age must be major than 18");
        }
        return this.isRegistered;
    }

}