package inheritance;

//import inheritance.Developer;

import java.time.LocalDateTime;

public class HierarchyRunner {

    public static void main(String[] args) {

        Developer dev = new Developer(
                "Siddesh",
                "9876543210",
                "sid@test.com",
                101,
                75000,
                LocalDateTime.now(),
                "Java"
        );

        System.out.println(dev.getName());          // From Person
        System.out.println(dev.getEmployeeId());    // From Employee
        System.out.println(dev.getProgrammingLanguage()); // From Developer
        
        // Calling inherited method from Employee class
        dev.signOut(LocalDateTime.now().plusHours(8));

        System.out.println("Developer Signed Out Successfully");
        
        System.out.println("Sign-In Time: " + dev.getSignIn());
}}