/**
 * Employee.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Store information about employees
 */
public class Employee{
    private String firstName;
    private String lastName;
    private long employeeNum;

    public Employee (String fName, String lName, long empNum) {
        this.firstName = fName;
        this.lastName = lName;
        this.employeeNum = empNum;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public long getEmployeeNum() {
        return this.employeeNum;
    }
}