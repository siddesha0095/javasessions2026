package classdigramEmployee;


import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Employee {

    private String name;
    private String contactNumber;
    private final int employeeId;
    private double salary;
    private final LocalDateTime signIn;
    private LocalDateTime signOut;

    private static final Pattern NAME_PATTERN =
            Pattern.compile("^[A-Za-z ]+$");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^[0-9]{10,15}$");

    public Employee(String name, String contactNumber, int employeeId,
                    double salary, LocalDateTime signIn) {

        if(signIn == null)
            throw new IllegalArgumentException("SignIn required");

        setName(name);
        setContactNumber(contactNumber);
        setSalary(salary);

        if(employeeId <= 0)
            throw new IllegalArgumentException("EmployeeId must be positive");

        this.employeeId = employeeId;
        this.signIn = signIn;
    }

    public void setName(String name) {
        if(name == null || name.isBlank())
            throw new IllegalArgumentException("Invalid Name");

        if(!NAME_PATTERN.matcher(name).matches())
            throw new IllegalArgumentException("Invalid Name");

        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        if(contactNumber == null || !PHONE_PATTERN.matcher(contactNumber).matches())
            throw new IllegalArgumentException("Invalid Contact Number");

        this.contactNumber = contactNumber;
    }

    public void setSalary(double salary) {
        if(salary <= 0)
            throw new IllegalArgumentException("Salary must be positive");

        this.salary = salary;
    }

    public void signOut(LocalDateTime signOut){

        if(signOut == null)
            throw new IllegalArgumentException("SignOut cannot be null");

        if(this.signOut != null)
            throw new IllegalStateException("Already signed out");

        if(signOut.isBefore(signIn))
            throw new IllegalArgumentException("Invalid SignOut Time");

        this.signOut = signOut;
    }

    // Getters needed by automation/reporting layers
    public String getName() { return name; }
    public int getEmployeeId() { return employeeId; }
    public LocalDateTime getSignIn() { return signIn; }
    public LocalDateTime getSignOut() { return signOut; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", signIn=" + signIn +
                ", signOut=" + signOut +
                '}';
    }
}