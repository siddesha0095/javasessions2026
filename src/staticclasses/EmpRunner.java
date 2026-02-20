package staticclasses;

public class EmpRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.companyNmae="infosys";
		
		Employee e1= new Employee("sid", 20000);
		System.out.println(e1);
		System.out.println(e1.getCompanyNmae());

		Employee e2= new Employee("Nav", 40000);
		System.out.println(e2);
		System.out.println(e2.getCompanyNmae());
	}

}
