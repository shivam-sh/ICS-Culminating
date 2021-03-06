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

    /**
     * Print out all of the Mac devices currently stored in the products array
     */
    public static void listMacs() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Mac){
                if(products[i].getName().equalsIgnoreCase(" ")) {
                    System.out.print("");
                }
                else {
                    System.out.println(products[i].toString());
                }
            }
        }
    }

    /**
     * Print out all of the iOS devices currently stored in the products array
    */
    public static void listIOS() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof iOS){
                System.out.println(products[i].toString());
            }
        }
    }
    
    /**
     * Dynamically resizes the array and adds a Mac device according to user input
     */
    public static void addMac() {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }

        FX.Clear();

        System.out.print("\nEnter the device name - ");
        String name = scan.nextLine();

        System.out.print("\nEnter the price (ex. 499.99) - ");
        Double price = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the number of colour options - ");
        int nCO = InputValidation.Int(scan.nextLine());

        System.out.print("\nEnter the number of processor options - ");
        int nPO = InputValidation.Int(scan.nextLine());

        System.out.print("\nEnter the number of memory options - ");
        int nMO = InputValidation.Int(scan.nextLine());

        System.out.print("\nEnter the number of graphics options - ");
        int nGO = InputValidation.Int(scan.nextLine());

        System.out.print("\nEnter the number of storage options - ");
        int nSO = InputValidation.Int(scan.nextLine());

        System.out.print("\nEnter the display size in inches - ");
        Double display = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the device's length (cm) - ");
        Double length = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the device's width (cm) - ");
        Double width = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the device's height (cm) - ");
        Double height = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the device's weight (kg) - ");
        Double weight = InputValidation.Double(scan.nextLine());

        temp[products.length] = new Mac(name, price, nCO, nPO, nMO, nGO, nSO, display, length, width, height, weight);

        FX.Clear();
        for (int i = 0; i < nCO; i++) {
            System.out.print("\nEnter colour option " + (i + 1) + " - ");
            ((Mac) temp[products.length]).addColourOption(scan.nextLine());
        }

        FX.Clear();
        for (int i = 0; i < nPO; i++) {
            System.out.print("\nEnter processor option " + (i + 1) + " - ");
            ((Mac) temp[products.length]).addProcessorOption(scan.nextLine());
        }

        FX.Clear();
        for (int i = 0; i < nMO; i++) {
            System.out.print("\nEnter memory option " + (i + 1) + "(ex. \"16 GB\") - ");
            ((Mac) temp[products.length]).addMemoryOption(scan.nextLine());
        }

        FX.Clear();
        for (int i = 0; i < nGO; i++) {
            System.out.print("\nEnter graphics option " + (i + 1) + " - ");
            ((Mac) temp[products.length]).addGraphicsOption(scan.nextLine());
        }

        FX.Clear();
        for (int i = 0; i < nSO; i++) {
            System.out.print("\nEnter storage option " + (i + 1) + "(ex. \"1 TB\") - ");
            ((Mac) temp[products.length]).addStorageOption(scan.nextLine());
        }
        products = temp;

        nameSort();
    }

    /**
     * Dynamically resizes the array and adds an iOS device according to user input
     */
    public static void addIOS() {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];

        }

        FX.Clear();

        System.out.print("\nEnter the device name - ");
        String name = scan.nextLine();

        System.out.print("\nEnter the price (ex. 499.99) - ");
        Double price = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the number of colour options - ");
        int nCO = InputValidation.Int(scan.nextLine());

        System.out.print("\nEnter the number of storage options - ");
        int nSO = InputValidation.Int(scan.nextLine());

        System.out.print("\nEnter the camera specs (ex. 12MP, 8MP) - ");
        String cam = scan.nextLine();

        System.out.print("\nEnter the cpu - ");
        String cpu = scan.nextLine();

        System.out.print("\nEnter the display size in inches - ");
        Double display = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the device's length (mm) - ");
        Double length = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the device's width (mm) - ");
        Double width = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the device's height (mm) - ");
        Double height = InputValidation.Double(scan.nextLine());

        System.out.print("\nEnter the device's weight (g) - ");
        Double weight = InputValidation.Double(scan.nextLine());

        temp[products.length] = new iOS(name, price, nCO, nSO, cam, cpu, display, length, width, height, weight);

        FX.Clear();
        for (int i = 0; i < nCO; i++) {
            System.out.print("\nEnter colour option [ " + (i + 1) + "] - ");
            ((iOS) temp[products.length]).addColourOption(scan.nextLine());
        }

        FX.Clear();
        for (int i = 0; i < nSO; i++) {
            System.out.print("\nEnter storage option [" + (i + 1) + "] - ");
            ((iOS) temp[products.length]).addStorageOption(scan.nextLine());
        }
        products = temp;

        nameSort();
    }


    /**
     * 
     */
    public static void listInventory() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + ", [Inventory - " + products[i].getInventory() + "]");
        }
    }

    /**
     * @param s
     */
    public static void removeProduct(String s) {
        int location = -1;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equalsIgnoreCase(s)) {
                location = i;
            }
        }

        if (location > -1) {
            products[location] = getProduct(products.length - 1);

            Product[] temp = new Product[products.length - 1];

            for (int i = 0; i < temp.length; i++) {
                temp[i] = products[i];
            }

            products = temp;

            System.out.println("Product deleted!");
        } else {
            System.out.println("Invalid input, nothing deleted");
        }

        nameSort();
    }

    /**
     * @param s
     * @return
     */
    public static int getNum(String s) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equalsIgnoreCase(s)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param i     [int]       - place in the array the product takes up
     * @return      [Product]   - the Product object that was requested
     */
    public static Product getProduct(int i) {
        return products[i];
    }

    /**
     * @param s     [String]    - name of the product
     * @return      [Product]   - the Product object that was requested
     */
    public static Product getProduct(String s) {
        return products[getNum(s)];
    }

    /**
     * @param item  [String]    - Name of the product being searched for
     * @param beg   [int]       - Just enter 0
     * @param end   [int]       - Enter ProductManager.getLength()
     * @return      [int]       - The location within the array of the product
     */
    public static int search(String item, int beg, int end) {
        int index = (beg + end) / 2;

        if(products.length % 2 == 0) {}
           
        else {
            Product[] temp = new Product[products.length+1];
            for(int i=0;i<products.length;i++) {
                temp[i] = products[i];
            }
            temp[products.length] = new Mac(" ", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
            products = temp;
        }

        if(item.equalsIgnoreCase(products[index].getName())) {
            return index;
        }

        else if (end-beg == 1) {
            return -1;
        }
        else if(beg == end) {
            return -1;
        }

        else if((end-beg) == 1) {
            if(item.equalsIgnoreCase(products[index+1].getName())) {
                return index;
            }
            else {
                return -1;
            }
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

    /** 
     * Save products database to file
     */
    public static void saveArray() {
        nameSort();
        try {
            //  Save the "products" database
            ObjectOutputStream outputCars = new ObjectOutputStream(new FileOutputStream("products.dat"));
            outputCars.writeObject(products);
            outputCars.close();

            System.out.println("Product Database Saved");
        }
        catch (Exception e) {
            System.out.println("An error ocurred, the database wasn't updated correctly. Please try again later.\n\n");
            e.printStackTrace();
        }
    }

    /** 
     * Load products database from file
     */
    public static void loadArray() {
        try {
            //  Load the "products" database
            FileInputStream carsIn = new FileInputStream("products.dat");
            ObjectInputStream in = new ObjectInputStream(carsIn);
            products = (Product[]) in.readObject();
            in.close();
            carsIn.close();

            System.out.println("Product Database Loaded Without Issues");
        }
        catch (Exception e) {
            System.out.println("An error ocurred, the database wasn't loaded correctly. Please try again.\n\n");
            e.printStackTrace();
        }
    }

    /** 
     * Sort the whole products array alphabetically by the name of the product
     */
    public static void nameSort() {
        for(int i=1; i < products.length; i++){
            String name = products[i].getName();
            Product temp = products[i];
            int j = i - 1;
            while(j >= 0 && compareWords(name, products[j].getName())) {
                products[j + 1] = products[j];
                j--;
            }
            products[j + 1] = temp; 
        }
    }

    
    /** 
     * @param s1
     * @param s2
     * @return
     * Note: it is impossible to have two words that are exactly the same
     */ 
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

    /**
     * @return      [int]   - The current size of the products array
     */
    public static int getLength() {
        return products.length;
    }

}