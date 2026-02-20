package staticclasses;

public class Employee {
	
	private String name;
	private int salary;
	public static String companyNmae="infosys";
	private String empid;
	private static int count=100;
	
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		count=count+1;
		this.empid="e"+count;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public static String getCompanyNmae() {
		return companyNmae;
	}


	public static void setCompanyNmae(String companyNmae) {
		Employee.companyNmae = companyNmae;
	}


	@Override
	public String toString() {
		return "Employee [companyNmae=" + companyNmae + ",name=" + name + ", salary=" + salary + ", empid=" + empid + "]";
	}
	
	
	
	
	

}
