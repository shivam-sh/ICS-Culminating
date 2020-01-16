import java.io.Serializable;

/**
 * Employee.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Store information about employees
 */
public class Employee implements Serializable{

    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;
    private long employeeNum;
    

    /**
     * @param fName  [String]       -Employee's first name
     * @param lName  [String]       -Employee's last name
     * @param empNum [long]         -Employee number
     */
    public Employee (String fName, String lName, long empNum) {
        this.firstName = fName;
        this.lastName = lName;
        this.employeeNum = empNum;
    }

    /**
     * @return [String]         -String with both the first and last name of the employee
     */
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * @return [String]         -String with just the first name of the employee
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return [String]          -String with just teh last name of the employee
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return [long]             -The employee's Employee Number
     */
    public long getEmployeeNum() {
        return this.employeeNum;
    }
}