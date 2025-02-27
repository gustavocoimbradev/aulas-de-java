public class Main {
    
    public static void main(String[] args){

        // Create objects

        User user1 = new User();
        user1.setEmail("user1@test.com");
        user1.setPassword("password123");

        User user2 = new User();
        user2.setEmail("user2@test.com");
        user2.setPassword("password123");
        
        // Read objects

        System.out.print("\n");

        System.out.println("## User 1");
        System.out.println(user1.getEmail());
        System.out.println(user1.getPassword());

        System.out.print("\n");

        System.out.println("## User 2");
        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());

        System.out.print("\n");

    }

}
