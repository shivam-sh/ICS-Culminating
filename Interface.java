/**
 * Culminating.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U NHSS
 * 
 * To put together the user interface for the database
 */

 import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EmployeeManager eManager = new EmployeeManager();

        FX.Logo();
        FX.Divider();

        System.out.println("Welcome to the Apple Store");
        System.out.print("Please enter your full name: ");
        String name = scan.nextLine();

            if (eManager.isEmployee(name)) {
                System.out.println("Please enter your employee number: ");
                Long eNum = scan.nextLong();

                if (/*employee number matches name*/false) {
                    
                }
            }

        //  Do While loop for Customer
        do {
        } while (/*input == "exit"*/false);

        scan.close();
        FX.Divider();

        FX.Exit();
    }
}
