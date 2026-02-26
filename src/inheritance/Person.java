package inheritance;

/**
 * WHY ABSTRACT? Person is a base blueprint. We should never create "new
 * Person()" directly.
 */
public abstract class Person {

	private String name;
	private String contactNumber;
	private String email;

	// Parent constructor - must be called by child
	public Person(String name, String contactNumber, String email) {
		setName(name);
		setContactNumber(contactNumber);
		this.email = email;
	}

	// Validation kept at root level (shared across all children)
	public void setName(String name) {
		if (name == null || !name.matches("^[A-Za-z ]+$"))
			throw new IllegalArgumentException("Invalid Name");
		this.name = name;
	}

	public void setContactNumber(String contactNumber) {
		if (contactNumber == null || !contactNumber.matches("^[0-9]{10,15}$"))
			throw new IllegalArgumentException("Invalid Contact Number");
		this.contactNumber = contactNumber;
	}

	public String getName() {
		return name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getEmail() {
		return email;
	}
}