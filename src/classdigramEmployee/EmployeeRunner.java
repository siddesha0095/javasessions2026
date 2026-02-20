package classdigramEmployee;





import java.time.LocalDateTime;

/**
 * WHY THIS CLASS EXISTS:
 * ----------------------
 * This is a simple execution class to verify Employee model behavior.
 * In real automation frameworks, similar setup happens inside test classes.
 *
 * This helps:
 * 1. Validate object creation
 * 2. Verify validations are working
 * 3. Ensure timestamps / business rules behave correctly
 */
public class EmployeeRunner {

    public static void main(String[] args) {

        try {
            // -------------------------------------------------------
            // STEP 1: Create Employee Object (Simulates Test Data Setup)
            // -------------------------------------------------------

            Employee emp = new Employee(
                    "Siddesh",
                    "9876543210",
                    101,
                    55000.00,
                    LocalDateTime.now()
            );

            System.out.println("Employee created successfully!");

            // -------------------------------------------------------
            // STEP 2: Simulate Employee Sign-Out (Business Operation)
            // -------------------------------------------------------

            LocalDateTime signOutTime = LocalDateTime.now().plusHours(9);
            emp.signOut(signOutTime);

            System.out.println("Employee signed out successfully!");

            // -------------------------------------------------------
            // STEP 3: Display Execution Summary (Like Logging)
            // -------------------------------------------------------

            System.out.println("Execution Completed at: " + LocalDateTime.now());
            
           System.out.println(emp);

        } catch (Exception e) {

            // -------------------------------------------------------
            // WHY: Centralized error handling (Same like Test Failure)
            // -------------------------------------------------------
            System.err.println("Test Data Validation Failed: " + e.getMessage());
        }
    }
}