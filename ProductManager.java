/**
 * ProductManager.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * To manage the system that stores all of the products
 */
public class ProductManager {
    private Product[] products = new Product[0];
    
    public void addMac(Mac m) {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }

        temp[products.length] = m;

        products = temp;
    }

    public void addIOS(iOS d) {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }

        temp[products.length] = d;

        products = temp;
    }

    public void search() {
        
    }

    public void saveArray() {
        
    }

    public void loadArray() {
        
    }

    public void sort() {
        
    }
}