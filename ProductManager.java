/**
 * ProductManager.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * 
 */
public class ProductManager {
    private Product[] products = new Product[0];
    
    public void addProduct() {
        Product[] temp = new Product[products.length + 1];

        for (int i = 0; i < products.length; i++) {
            temp[i] = products[i];
        }
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