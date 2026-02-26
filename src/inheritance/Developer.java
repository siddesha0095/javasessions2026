package inheritance;


/**
 * FINAL because we don't want further extension.
 * This is a leaf node in hierarchy.
 */
public final class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String contactNumber, String email,
                     int employeeId, double salary,
                     java.time.LocalDateTime signIn,
                     String programmingLanguage) {

        super(name, contactNumber, email, employeeId, salary, signIn);

        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}