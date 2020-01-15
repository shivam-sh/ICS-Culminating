/**
 * MakeArray.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Stores and manages instances of employee objects
 */

 import java.util.Scanner;

public class MakeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What would you like to add?");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("iOS")) {
            ProductManager.addIOS();
        } else if (input.equalsIgnoreCase("mac")) {
            ProductManager.addMac();
        }

        System.out.println(ProductManager.getLength());

        ProductManager.nameSort();

        System.out.println(ProductManager.getLength());

        ProductManager.saveArray();

        System.out.println(ProductManager.getLength());

        ProductManager.loadArray();

        System.out.println(ProductManager.getLength());

        System.out.println(((Mac)(ProductManager.getProduct(0))).numProcessors());
        ((Mac)ProductManager.getProduct(0)).printSpecs();

        scan.close();
    }
}