package inheritance;

import java.time.LocalDateTime;

/**
 * Employee IS-A Person Gets personal data automatically via inheritance.
 */
public class Employee extends Person {

	private int employeeId;
	private double salary;
	private LocalDateTime signIn;
	private LocalDateTime signOut;

	// Child must call parent constructor using super()
	public Employee(String name, String contactNumber, String email, int employeeId, double salary,
			LocalDateTime signIn) {

		super(name, contactNumber, email); // Calls Person constructor

		if (employeeId <= 0)
			throw new IllegalArgumentException("Invalid Employee ID");

		if (salary <= 0)
			throw new IllegalArgumentException("Invalid Salary");

		this.employeeId = employeeId;
		this.salary = salary;
		this.signIn = signIn;
	}
	
	public LocalDateTime getSignIn() {
	    return signIn;
	    
	}

	public void signOut(LocalDateTime signOut) {
		if (signOut.isBefore(signIn))
			throw new IllegalArgumentException("Invalid SignOut Time");

		this.signOut = signOut;
		System.out.println("SignOut executed from Employee class"+signOut);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double getSalary() {
		return salary;
	}
}