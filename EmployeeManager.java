/**
 * EmployeeManager.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Stores and manages instances of employee objects
 */
public class EmployeeManager {
    private Employee[] employees = new Employee[0];

    public void addEmployee(Employee e) {
        Employee[] temp = new Employee[employees.length + 1];

        for (int i = 0; i < employees.length; i++) {
            temp[i] = employees[i];
        }

        temp[employees.length] = e;

        employees = temp;
    }

    /** Return whether the inputted name matches the name of an employee
     * @param input     []
     * @return          []
     */
    public boolean isEmployee(String input){
        for (int i = 0; i < employees.length; i++) {
            if (input == employees[i].getName()) {
                return true;
            }
        }
        return false;
    }

    public void search() {
        
    }

    public void saveArray() {
        
    }

    public void loadArray() {
        
    }

    public void sort() {
        
    }
}