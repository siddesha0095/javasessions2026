package staticclasses;

public class EmpRunnerThreadSafe {

    public static void main(String[] args) {

    	EmployeeThreadSafe.setCompanyName("Infosys");

        Employee e1 = new Employee("Sid", 20000);
        Employee e2 = new Employee("Nav", 40000);

        System.out.println(e1);
        System.out.println(e2);
    }
}
