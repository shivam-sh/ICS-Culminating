/**
 * AddEmployee
 * 
 * Debug class to make employee database
 */

 import java.util.Scanner;

public class AddEmployee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        EmployeeManager.loadArray();

        System.out.println("Array Loaded, # of employees: " + EmployeeManager.getLength());

        EmployeeManager.addEmployee();

        EmployeeManager.saveArray();
        
        scan.close();
    }
}