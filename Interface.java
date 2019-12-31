/**
 * Culminating.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * To put together the user interface for the database
 */

 import java.util.Scanner;

public class Interface {
    static int[] cart = new int[30];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        FX.Logo();
        FX.Divider();

        System.out.println("Welcome to the Apple Store");
        System.out.print("Please enter your full name: ");
        String name = scan.nextLine();

            if (EmployeeManager.isEmployee(name)) {
                System.out.println("Please enter your employee number: ");
                Long eNum = scan.nextLong();

                if (/*employee number matches name*/false) {
                    //Do Smething
                }
            } 
            else {
                do {
                    System.out.println("Apple Product Homepage");

                    System.out.print("Cart: ");
                    if (cartIsEmpty()) {
                        System.out.println("Empty");
                    } else {
                        for (int i = 0; i < cart.length; i++) {
                            System.out.println( ProductManager.getProduct(cart[i]).toString() );
                        }
                    }
        
                    System.out.println("[Search] [Checkout] [Exit]");
                } while (/*input == "exit"*/false);
            }

        scan.close();
        FX.Divider();

        FX.Exit();
    }

    /**     Checks to see if cart ic empty
     * @return      [boolean] - Is the cart empty?
     */
    public static boolean cartIsEmpty() {
        int items = 0;

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != 0) {
                items++;
            }
        }

        if (items == 0) {
            return true;
        }

        return false;
    }

    //  Input validation methods to prevent code crashing errors due to invalid inputs
    public static int inputValidationInt(String s){
        int num = 0;
        try {
            num = Integer.parseInt(s);
        } catch(Exception e) {
            num = 69;
        }
        return num;
    }

    public static double inputValidationDouble(String s){
        double num = 0;
        try {
            num = Double.parseDouble(s);
        } catch(Exception e) {
            num = 69;
        }
        return num;
    }
}
