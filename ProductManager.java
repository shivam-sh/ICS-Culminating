/**
 * ProductManager.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * To manage the system that stores all of the products
 */

 import java.io.*;

public class ProductManager implements Serializable {

    private static final long serialVersionUID = 1L;
    private static Product[] products = new Product[0];

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
    public static void addMac(Mac m) {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }

        temp[products.length] = m;

        products = temp;
    }

    /**
     * @param d
     */
    public static void addIOS(iOS d) {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }

        temp[products.length] = d;

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
}