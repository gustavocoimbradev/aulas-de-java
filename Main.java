import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Welcome!");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int option = 0;

        while (option != 4) {

            System.out.println("\n1 - Register student");
            System.out.println("2 - View registered students");
            System.out.println("3 - Clear registrations");
            System.out.println("4 - Exit");
            System.out.print("\nChoose one of the options above: ");

            option = Integer.parseInt(scanner.nextLine());

            if (option == 1) {

                System.out.print("\nEnter the name: ");
                String name = scanner.nextLine();

                System.out.print("Enter the address: ");
                String address = scanner.nextLine();

                System.out.print("Enter the phone number: ");
                String phone = scanner.nextLine();

                System.out.print("Enter the email: ");
                String email = scanner.nextLine();

                System.out.print("Enter the registration number: ");
                String registration = scanner.nextLine();

                if(students.add(new Student(name, address, phone, email, registration))){
                    System.out.print("\nStudent successfully registered!\n");
                } else {
                    System.out.print("\nFailed to register student, please try again.\n");
                }

            }
            
            if (option == 2) {
                if (students.size() > 0) {
                    for(Student student : students) {
                        System.out.print("\n");
                        student.printData();
                    }
                } else {
                    System.out.print("\nNo students registered.\n");
                }
            }

            if (option == 3) {
                System.out.print("\nThis is a destructive action. Are you sure? (Y/N): ");
                String areYouSure = scanner.nextLine();
                System.out.println(areYouSure);
                if (areYouSure.equals("S") || areYouSure.equals("s") || areYouSure.equals("Y") || areYouSure.equals("Y")) {
                    students.clear();
                    if(students.isEmpty()){
                        System.out.print("\nAll students have been removed.\n");
                    } else {
                        System.out.print("\nFailed to clear students, please try again.\n");
                    }
                }
            }

        }

    }

}
