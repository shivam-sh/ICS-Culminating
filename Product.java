/**
 * Products.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * 
 */

 import java.text.NumberFormat;

public abstract class Product {
    protected String name;
    protected double price;
    public NumberFormat currency = NumberFormat.getCurrencyInstance();

    /** Create a new product type
     * @param name
     * @param price
     */
    public Product(String n, double p) {
        name = n;
        price = p;
    }

    public String toString() {
        return this.name + " - " + currency.format(this.price);
    }
    
}