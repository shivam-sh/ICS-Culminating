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
    static int[] cart = new int[30];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;

        ProductManager.loadArray();

        FX.Bootup();
        FX.Clear();

        System.out.println("Welcome to the Apple Store");
        System.out.print("Please enter your full name: ");
        System.out.println(((Mac)(ProductManager.getProduct(0))).numProcessors());
        ((Mac)ProductManager.getProduct(0)).printSpecs();
        String name = scan.nextLine();

        //  If an employee may be using the database
        if (EmployeeManager.isEmployee(name)) {
            FX.Clear();
            System.out.println("Please enter your employee number: ");
            Long empNum = scan.nextLong();

            if (EmployeeManager.correctEmployeeNum(name, empNum)) {
                do {
                    FX.Clear();
                    System.out.println("\n\nApple Employee Homepage");
                    System.out.println("What would you like to do?");
                    System.out.println("[Browse Products] [Add Product] [Remove Product] [Order Inventory] [Exit]");
                    input = scan.next();

                    if (input.equalsIgnoreCase("browse products") || input.equalsIgnoreCase("browse") || input.equalsIgnoreCase("b")) {
                        FX.Clear();
                        System.out.println("\nBrowse Products");
                        
                    }
                    if (input.equalsIgnoreCase("add product") || input.equalsIgnoreCase("add") || input.equalsIgnoreCase("a")) {
                        FX.Clear();
                        System.out.println("\nAdd Product");
                        
                    }
                    if (input.equalsIgnoreCase("remove product") || input.equalsIgnoreCase("remove") || input.equalsIgnoreCase("r")) {
                        FX.Clear();
                        System.out.println("\nRemove Product");
                        
                    }
                    if (input.equalsIgnoreCase("order inventory") || input.equalsIgnoreCase("order") || input.equalsIgnoreCase("o")) {
                        FX.Clear();
                        System.out.println("\nOrder Inventory");
                        
                    }

                } while(!(input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("x")));
            }
        } 

        // If a customer is using the database
        else {
            do {
                FX.Clear();
                System.out.println("\n\nApple Product Homepage");
                System.out.print("Cart: ");
                if (cartIsEmpty()) {
                    System.out.println("Empty");
                } else {
                    for (int i = 0; i < cart.length; i++) {
                        System.out.println( ProductManager.getProduct(cart[i]).toString() );
                    }
                }
        
                System.out.println("[Search] [Checkout] [Exit]");
                input = scan.next();

                if (input.equalsIgnoreCase("search") || input.equalsIgnoreCase("s")) {
                    FX.Clear();
                    System.out.println("\nSearch");
                    System.out.println("\nWhat are you looking for?");
                    input = scan.next();

                    System.out.println(ProductManager.getLength());

                    if (ProductManager.search(input, 0, ProductManager.getLength()) != -1) {
                        System.out.println("\n");
                        ProductManager.getProduct(ProductManager.search(input, 0, ProductManager.getLength())).printSpecs();
                    } else {
                        System.out.println("Sorry, that isn't in the database ");
                        System.out.println("Heres some options");
                        ProductManager.listIOS();
                        ProductManager.listMacs();
                        System.out.println();
                    }
                    

                    
                }
                if (input.equalsIgnoreCase("checkout") || input.equalsIgnoreCase("c")) {
                    FX.Clear();
                    System.out.println("\nCheckout");
                }

            } while (!(input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("x")));
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
