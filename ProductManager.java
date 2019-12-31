/**
 * ProductManager.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * To manage the system that stores all of the products
 */
public class ProductManager {
    private static Product[] products = new Product[0];
    
    public static void addMac(Mac m) {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }

        temp[products.length] = m;

        products = temp;
    }

    public static void addIOS(iOS d) {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }

        temp[products.length] = d;

        products = temp;
    }

    public static Product getProduct(int i) {
        return products[i];
    }

    public static void search() {
        
    }

    public static void saveArray() {
        
    }

    public static void loadArray() {
        
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

    public static boolean compareWords(String s1, String s2) {
        // Note: it is impossible to have two words that are exactly the same
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

        // if you reach the last letter, then the other word must be longer and therefore lwoer alphabetically
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