public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("John");
        person.setAge(18);
        person.save();

        if (person.isAdult()) {
            if (person.save()) {
                System.out.println("Person successfully registered");
            } else {
                System.out.println("Some error ocurred. Please try again");
            }
        } else {
            System.err.println("Age must be major than 18");
        }
    
    }

}