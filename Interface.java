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

        FX.Logo();
        FX.Divider();

        System.out.println("Welcome to the Apple Store");
        System.out.print("Please enter your full name: ");
        String input = scan.nextLine();

        do {
            
        } while (input == "exit");

        scan.close();
        FX.Divider();

        FX.Exit();
    }
}
