/**
 * Products.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * To create a template based on which the product classes are formed
 */

 import java.text.NumberFormat;

public abstract class Product {
    private String name;
    private double price;
    public NumberFormat currency = NumberFormat.getCurrencyInstance();

    /** Create a new product type
     * @param name
     * @param price
     */
    public Product(String n, double p) {
        this.name = n;
        this.price = p;
    }

    /** 
     *  Print out info for the item
     */
    public void printSpecs() {
        System.out.println(this.name + " - " + currency.format(this.price));
    }

    public String toString() {
        return this.name + " [" + currency.format(this.price) + "]";
    }
    
}


/*
Name [Price]
*/