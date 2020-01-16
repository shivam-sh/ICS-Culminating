/**
 * Culminating.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U NHSS
 * 
 * To put together the user interface for the database
 */

 import java.util.Scanner;
 import java.text.NumberFormat;

public class Interface {
    static int[] cart = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in);
        String input;
        Boolean searching;

        ProductManager.loadArray();
        EmployeeManager.loadArray();

        FX.Bootup();
        FX.Clear();

        System.out.println("Welcome to the Apple Store");
        System.out.print("Please enter your full name: ");
        String name = scan.nextLine();

        //  If an employee may be using the database
        System.out.println("Interface: " + EmployeeManager.isEmployee(name));
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
                    input = scan.nextLine();

                    // Done, not bugtested
                    if (input.equalsIgnoreCase("Browse products") || input.equalsIgnoreCase("Browse") || input.equalsIgnoreCase("b")) {
                        FX.Clear();
                        System.out.println("\nBrowse Products");
                        do {
                            FX.Clear();
                            System.out.println("\nSearch");
                            System.out.println("\nWhat are you looking for?");
                            System.out.println("[Product Name] [Exit]");
                            input = scan.nextLine();
    
                            if (ProductManager.search(input, 0, ProductManager.getLength()) != -1) {
                                FX.Clear();
                                ProductManager.getProduct(ProductManager.search(input, 0, ProductManager.getLength())).printSpecs();
    
                                System.out.println("[Exit]");
                                input = scan.nextLine();
    
                            } else {
                                System.out.println("Sorry, that isn't in the database ");
                                System.out.println("Here are some options");
                                ProductManager.listIOS();
                                ProductManager.listMacs();
                                scan.nextLine();
                            }
                        } while (!(input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("x")));
                        input = "l";
                    }

                    // Done, not bugtested
                    if (input.equalsIgnoreCase("Add product") || input.equalsIgnoreCase("Add") || input.equalsIgnoreCase("a")) {
                        FX.Clear();
                        System.out.println("\nAdd Product");
                        
                        System.out.println("What device would you like to add?");
                        System.out.println("[Mac] [iOS] [Exit]");
                        input = scan.nextLine();

                        if (input.equalsIgnoreCase("iOS") || input.equalsIgnoreCase("iPhone") || input.equalsIgnoreCase("iPad") || input.equalsIgnoreCase("I")) {
                            ProductManager.addIOS();
                        } else if (input.equalsIgnoreCase("Mac") || input.equalsIgnoreCase("MacBook") || input.equalsIgnoreCase("M")) {
                            ProductManager.addMac();
                        }
                    }

                    // Done, not bugtested
                    if (input.equalsIgnoreCase("Remove product") || input.equalsIgnoreCase("Remove") || input.equalsIgnoreCase("r")) {
                        FX.Clear();
                        System.out.println("\nRemove Product");
                        System.out.println("Which product would you like to remove?");
                        input = scan.nextLine();

                        ProductManager.removeProduct(input);

                        scan.nextLine();
                    }
                    
                    // Needs to be finished
                    if (input.equalsIgnoreCase("Order inventory") || input.equalsIgnoreCase("Order") || input.equalsIgnoreCase("o")) {
                        FX.Clear();
                        System.out.println("\nOrder Inventory");
                        
                    }

                } while(!(input.equalsIgnoreCase("Exit") || input.equalsIgnoreCase("E") || input.equalsIgnoreCase("X")));
            } else {
                System.out.println("Incorrect Employee Number");
            }
        } 

        // If a customer is using the database
        else {
            do {
                FX.Clear();
                System.out.println("\n\nApple Product Homepage");
                System.out.println("Cart: ");
                if (itemsInCart() == 0) {
                    System.out.println("Empty");
                } else {
                    for (int i = 0; i < cart.length; i++) {
                        if (cart[i] != -1) {
                            System.out.println( ProductManager.getProduct(cart[i]).toString() );
                        }
                    }
                }
        
                System.out.println("[Search] [Checkout] [Exit]");
                input = scan.nextLine();

                // Done, not bugtested
                if (input.equalsIgnoreCase("Search") || input.equalsIgnoreCase("S")) {
                    do {
                        FX.Clear();
                        System.out.println("\nSearch");
                        System.out.println("\nWhat are you looking for?");
                        System.out.println("[Product Name] [Exit]");
                        input = scan.nextLine();

                        if (ProductManager.search(input, 0, ProductManager.getLength()) != -1) {
                            String product = input;
                            FX.Clear();
                            ProductManager.getProduct(ProductManager.search(input, 0, ProductManager.getLength())).printSpecs();

                            System.out.println("[Add to Cart] [Exit]");
                            input = scan.nextLine();

                            if (input.equalsIgnoreCase("Add to Cart") || input.equalsIgnoreCase("Add") || input.equalsIgnoreCase("A")){
                                searching = true;
                                for (int i = 0; i < cart.length && searching; i++) {
                                    if (cart[i] == -1) {

                                        cart[i] = ProductManager.getNum(product);

                                        searching = false;
                                        System.out.println("\nAdded to cart");
                                        System.out.println("[Exit]");
                                        scan.nextLine();
                                        input = "exit";
                                    }
                                }
                            }
                        } else {
                            System.out.println("Sorry, that isn't in the database ");
                            System.out.println("Here are some options");
                            ProductManager.listIOS();
                            ProductManager.listMacs();
                            scan.nextLine();
                        }
                    } while (!(input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("x")));
                    input = "a";
                }
                
                // Done, not bugtested
                if (input.equalsIgnoreCase("Checkout") || input.equalsIgnoreCase("C")) {
                    FX.Clear();
                    System.out.println("\nCheckout");

                    double cost = 0;
                    for (int i = 0; i < cart.length; i++) {
                        if (cart[i] != -1) {
                            cost += ProductManager.getProduct(cart[i]).getPrice();
                        }
                    }

                    System.out.println("Cart: ");
                    if (itemsInCart() == 0) {
                        System.out.println("Empty");
                    } else {
                        for (int i = 0; i < cart.length; i++) {
                            if (cart[i] != -1) {
                                System.out.println( ProductManager.getProduct(cart[i]).toString() );
                            }
                        }
                    }

                    System.out.print("Total Cost: " + currency.format(cost));

                    System.out.print("\n\nCard Number - ");
                    scan.nextLine();

                    System.out.print("\n\nCVV - ");
                    scan.nextLine();

                    System.out.print("\n\nShipping Address - ");
                    scan.nextLine();

                    System.out.print("\n\nBilling Address - ");
                    scan.nextLine();

                    System.out.println("[Confirm] [Cancel]");
                    input = scan.nextLine();

                    if (input.equalsIgnoreCase("Confirm") || input.equalsIgnoreCase("C")) {
                        System.out.println("Order Placed!");
                        scan.nextLine();

                        for (int i = 0; i < cart.length; i++) {
                            cart[i] = -1;
                        }
                    } else {
                        System.out.println("Order Canceled");

                        scan.nextLine();

                        for (int i = 0; i < cart.length; i++) {
                            cart[i] = -1;
                        }
                    }
                }

            } while (!(input.equalsIgnoreCase("Exit") || input.equalsIgnoreCase("E") || input.equalsIgnoreCase("X")));
        }

        scan.close();
        FX.Divider();

        FX.Exit();
    }

    /**     Checks to see if cart is empty
     * @return      [int] - # of items in cart?
     */
    public static int itemsInCart() {
        int items = 0;

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != -1) {
                items++;
            }
        }

        return items;
    }
}
