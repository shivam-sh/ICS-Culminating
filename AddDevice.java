/**
 * MakeArray.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Stores and manages instances of employee objects
 */

 import java.util.Scanner;

public class AddDevice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ProductManager.loadArray();

        System.out.println("There are currently " + ProductManager.getLength() + " devices in the database");

        System.out.println("What would you like to add? [mac or ios]");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("iOS")) {
            ProductManager.addIOS();
        } else if (input.equalsIgnoreCase("mac")) {
            ProductManager.addMac();
        }

        ProductManager.nameSort();

        ProductManager.saveArray();

        scan.close();
    }
}