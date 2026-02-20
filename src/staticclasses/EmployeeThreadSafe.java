package staticclasses;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ============================================================================
 * Employee Class (Thread-Safe Version)
 * ============================================================================
 *
 * This version ensures ID generation works correctly even when
 * tests run in parallel (e.g., Selenium Grid, CI pipelines).
 *
 * WHY CHANGE WAS NEEDED?
 * Earlier we used:
 *      static int count; count++;
 *
 * That is NOT thread-safe.
 * Multiple threads could generate duplicate IDs.
 *
 * Now we use AtomicInteger which guarantees safe increment.
 *
 * INTERVIEW NOTE:
 * Always protect shared static state in concurrent environments.
 */
public class EmployeeThreadSafe {

    private String name;
    private int salary;

    /** Shared company name across all employees */
    private static String companyName;
    
    

    /** Unique employee ID */
    private String empId;

    /**
     * Thread-safe shared counter.
     * AtomicInteger ensures no duplicate IDs in parallel execution.
     */
    private static final AtomicInteger count = new AtomicInteger(100);

    /**
     * Constructor initializes employee data and generates unique ID.
     */
    public EmployeeThreadSafe(String name, int salary) {
        this.name = name;
        this.salary = salary;

        // Thread-safe increment
        this.empId = "e" + count.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
    	EmployeeThreadSafe.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee [companyName=" + companyName +
                ", name=" + name +
                ", salary=" + salary +
                ", empId=" + empId + "]";
    }
}

