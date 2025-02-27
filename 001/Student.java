public class Student {
 
    String name;
    String address;
    String phone;
    String email;
    String registration;

    public Student(String name, String address, String phone, String email, String registration) {
        this.name           = name;
        this.address        = address;
        this.phone          = phone;
        this.email          = email;
        this.registration   = registration;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Registration: " + registration);
    }

}