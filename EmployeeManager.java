/**
 * EmployeeManager.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Stores and manages instances of employee objects
 */
public class EmployeeManager {
    private static Employee[] employees = new Employee[0];

    public static void addEmployee(Employee e) {
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
    public static boolean isEmployee(String input){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }

    public static boolean correctEmployeeNum(String input, long employeeNumber) {
        if (getEmployee(input).getEmployeeNum() == employeeNumber) {
            return true;
        }
        return false;
    }

    public static Employee getEmployee(String input) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equalsIgnoreCase(input)) {
                return employees[i];
            }
        }
        return null;
    }

    public static void search() {
        
    }

    public static void saveArray() {
        
    }

    public static void loadArray() {
        
    }

    public static void sort() {
        
    }
}