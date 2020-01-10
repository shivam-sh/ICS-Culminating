/**
 * EmployeeManager.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Stores and manages instances of employee objects
 */

 import java.io.*;
 import java.util.Scanner;

public class EmployeeManager implements Serializable {

    private static final long serialVersionUID = 1L;

    //  Initialize database to stora ll employees as well as scanner
    private static Employee[] employees = new Employee[0];
    static Scanner scan = new Scanner(System.in);

    /** Adds the inputted employee object to the array
     * @param e     [Employee]  - Employee object to add into array
     */
    public static void addEmployee(Employee e) {
        Employee[] temp = new Employee[employees.length + 1];

        for (int i = 0; i < employees.length; i++) {
            temp[i] = employees[i];
        }

        temp[employees.length] = e;

        employees = temp;
    }

    /**
     * Asks user for inputs in order to add an employee object to the array
     */
    public static void addEmployee() {
        Employee[] temp = new Employee[employees.length + 1];

        for (int i = 0; i < employees.length; i++) {
            temp[i] = employees[i];
        }

        FX.Clear();

        System.out.print("Enter the employee's first name - ");
        String fName = scan.nextLine();

        System.out.print("Enter the last name - ");
        String lName = scan.nextLine();

        System.out.print("Enter the employee number - ");
        long empNum = inputValidationLong(scan.nextLine());

        temp[employees.length] = new Employee(fName, lName, empNum);

        employees = temp;
    }

    /** Return whether the inputted name matches the name of an employee
     * @param input     [String]    - Employee name 
     * @return          [boolean]   - Whether or not the name matches that of an employee
     */
    public static boolean isEmployee(String input){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equalsIgnoreCase(input)) {
                return true;
            }
        }
        return false;
    }

    /** Validates the employee number against the employee name
     * @param input             [String]    - Employee name
     * @param employeeNumber    [long]      - Employee number
     * @return                  [boolean]   - Whether the name and number match eachother
     */
    public static boolean correctEmployeeNum(String input, long employeeNumber) {
        if (getEmployee(input).getEmployeeNum() == employeeNumber) {
            return true;
        }
        return false;
    }

    /** Returns the employee object given the name
     * @param input     [String]    - Employee name
     * @return          [Employee]  - Employee object with the given name
     */
    public static Employee getEmployee(String input) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equalsIgnoreCase(input)) {
                return employees[i];
            }
        }
        return null;
    }

    /**
     *  Save the employees array to an employees.dat file
     */
    public static void saveArray() {
        try {
            ObjectOutputStream outputCars = new ObjectOutputStream(new FileOutputStream("employees.dat"));
            outputCars.writeObject(employees);
            outputCars.close();
            System.out.println("Successfully saved file.");
        }
    
        catch (Exception e) {
            System.out.println("An error ocurred, the file wasn't updated correctly. Please try again later.\n\n");
            e.printStackTrace();
        }
    }

    /**
     *  Load the employees array from the employees.dat file
     */
    public static void loadArray() {
        try {
            //  Load the "employees" database
            FileInputStream carsIn = new FileInputStream("employees.dat");
            ObjectInputStream in = new ObjectInputStream(carsIn);
            employees = (Employee[]) in.readObject();
            in.close();
            carsIn.close();

            System.out.println("Database Loaded Without Issues");
        }
        catch (Exception e) {
            System.out.println("An error ocurred, the database wasn't loaded correctly. Please try again.\n\n");
            e.printStackTrace();
        }
    }

    //  Input validation methods to prevent code crashing errors due to invalid inputs
    public static long inputValidationLong(String s){
        long num = 0;
        try {
            num = Long.parseLong(s);
        } catch(Exception e) {
            num = 0;
        }
        return num;
    }
}