/**
 * ProductManager.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * To manage the system that stores all of the products
 */

 import java.io.*;
 import java.util.Scanner;

public class ProductManager implements Serializable {

    private static final long serialVersionUID = 1L;
    private static Product[] products = new Product[0];
    static Scanner scan = new Scanner(System.in);

    public static void listMacs() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Mac){
                System.out.println(products[i].toString());
            }
        }
    }

    /**
    */
    public static void listIOS() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof iOS){
                System.out.println(products[i].toString());
            }
        }
    }
    
    /**
     * @param m
     */
    public static void addMac() {
        Product[] temp = new Product[products.length + 1];
        int productNum = 0;

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
            productNum = i;
        }

        System.out.println("\nEnter the device name: ");
        String name = scan.nextLine();

        System.out.println("\nEnter the price (ex. 499.99): ");
        Double price = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the number of colour options: ");
        int nCO = inputValidationInt(scan.nextLine());

        System.out.println("\nEnter the number of processor options: ");
        int nPO = inputValidationInt(scan.nextLine());

        System.out.println("\nEnter the number of memory options: ");
        int nMO = inputValidationInt(scan.nextLine());

        System.out.println("\nEnter the number of graphics options: ");
        int nGO = inputValidationInt(scan.nextLine());

        System.out.println("\nEnter the number of storage options: ");
        int nSO = inputValidationInt(scan.nextLine());

        System.out.println("\nEnter the display size in inches: ");
        Double display = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the device's length (mm): ");
        Double length = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the device's width (mm): ");
        Double width = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the device's height (mm): ");
        Double height = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the device's weight (g): ");
        Double weight = inputValidationDouble(scan.nextLine());

        temp[products.length] = new Mac(name, price, nCO, nPO, nMO, nGO, nSO, display, length, width, height, weight);

        for (int i = 0; i < nCO; i++) {
            System.out.println("Enter colour option [" + (i + 1) + "]: ");
            ((Mac) temp[productNum]).addColourOption(scan.nextLine());
        }

        for (int i = 0; i < nPO; i++) {
            System.out.println("Enter processor option [" + (i + 1) + "]: ");
            ((Mac) temp[productNum]).addProcessorOption(scan.nextLine());
        }

        for (int i = 0; i < nMO; i++) {
            System.out.println("Enter memory option [" + (i + 1) + "]: ");
            ((Mac) temp[productNum]).addMemoryOption(scan.nextLine());
        }

        for (int i = 0; i < nGO; i++) {
            System.out.println("Enter graphics option [" + (i + 1) + "]: ");
            ((Mac) temp[productNum]).addGraphicsOption(scan.nextLine());
        }

        for (int i = 0; i < nSO; i++) {
            System.out.println("Enter storage option [" + (i + 1) + "]: ");
            ((Mac) temp[productNum]).addStorageOption(scan.nextLine());
        }

        products = temp;
    }

    public static void addIOS() {
        Product[] temp = new Product[products.length + 1];
        int productNum = 0;

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];

            productNum = i;
        }
        System.out.println("\nEnter the device name: ");
        String name = scan.nextLine();

        System.out.println("\nEnter the price (ex. 499.99): ");
        Double price = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the number of colour options: ");
        int nCO = inputValidationInt(scan.nextLine());

        System.out.println("\nEnter the number of storage options: ");
        int nSO = inputValidationInt(scan.nextLine());

        System.out.println("\nEnter the camera specs (ex. 12MP, 8MP): ");
        String cam = scan.nextLine();

        System.out.println("\nEnter the cpu: ");
        String cpu = scan.nextLine();

        System.out.println("\nEnter the display size in inches: ");
        Double display = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the device's length (mm): ");
        Double length = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the device's width (mm): ");
        Double width = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the device's height (mm): ");
        Double height = inputValidationDouble(scan.nextLine());

        System.out.println("\nEnter the device's weight (g): ");
        Double weight = inputValidationDouble(scan.nextLine());

        temp[products.length] = new iOS(name, price, nCO, nSO, cam, cpu, display, length, width, height, weight);

        for (int i = 0; i < nCO; i++) {
            System.out.println("Enter colour option [ " + (i + 1) + "]: ");
            ((iOS) temp[productNum]).addColourOption(scan.nextLine());
        }

        for (int i = 0; i < nSO; i++) {
            System.out.println("Enter storage option [" + (i + 1) + "]: ");
            ((iOS) temp[productNum]).addStorageOption(scan.nextLine());
        }
        products = temp;
    }

    /**
     * @param i
     * @return
     */
    public static Product getProduct(int i) {
        return products[i];
    }

    /**
     * @param item
     * @param beg
     * @param end
     * @return
     */
    public static int search(String item, int beg, int end) {
        int index = (beg + end)/2;

        if(item.equalsIgnoreCase(products[index].getName())) {
            return index;
        }
        else if(beg == end) {
            return -1;
        }

        else {
            if(compareWords(item, products[index].getName())) {
                end = index;
                index = search(item, beg, end);
            }
            else {
                beg = index;
                index = search(item, beg, end);
            }
        }

        return index;
    }

    /** Save employees database to file
     */
    public static void saveArray() {
        try {
            //  Save the "products" database
            ObjectOutputStream outputCars = new ObjectOutputStream(new FileOutputStream("products.dat"));
            outputCars.writeObject(products);
            outputCars.close();

            System.out.println("Database Saved");
        }
        catch (Exception e) {
            System.out.println("An error ocurred, the database wasn't updated correctly. Please try again later.");
        }
    }

    /** Load employees database from file
     */
    public static void loadArray() {
        try {
            //  Load the "cars" database
            FileInputStream carsIn = new FileInputStream("products.dat");
            ObjectInputStream in = new ObjectInputStream(carsIn);
            products = (Product[]) in.readObject();
            in.close();
            carsIn.close();

            System.out.println("Database Loaded Without Issues");
        }
        catch (Exception e) {
            System.out.println("An error ocurred, the database wasn't loaded correctly. Please try again.");
        }
    }

    public static void nameSort (Product[] arr) {
        for(int i=1; i < arr.length; i++){
            String name = arr[i].getName();
            Product temp = arr[i];
            int j = i - 1;
            while(j >= 0 && compareWords(name, arr[j].getName())) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp; 
        }
    }

    // Note: it is impossible to have two words that are exactly the same
    public static boolean compareWords(String s1, String s2) {
        
        boolean higher;

        //sets both words to lower case
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // if first letter of word #1 is higher alphabetically than word #2 then word #1 is higher alphabetically
        if(s1.charAt(0) < s2.charAt(0)) {
            higher = true;
        }

        // same thing but reversed (higher <-> lower)
        else if(s1.charAt(0) > s2.charAt(0)) {
            higher = false;
        }

        // if you reach the last letter, then the other word must be longer and therefore lower alphabetically
        else if(s1.length() == 1){
            higher =  true;
        }

        else if(s2.length() == 1){
            higher =  false;
        }

        // recursive method to loop back with the same words minus their first letter
        else {
            s1 = s1.substring(1);
            s2 = s2.substring(1);
            higher = compareWords(s1, s2);
        }

        return higher;
    }

    //  Input validation methods to prevent code crashing errors due to invalid inputs
    public static double inputValidationDouble(String s){
        double num = 0;
        try {
            num = Double.parseDouble(s);
        } catch(Exception e) {
            num = 69;
        }
        return num;
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
}