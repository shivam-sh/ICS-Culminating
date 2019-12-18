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
    protected String processor;
    protected double price;
    protected int numColour;

    public NumberFormat currency = NumberFormat.getCurrencyInstance();

    /** Create a new product type
     * @param name
     * @param price
     */
    public Product(String n, String proc, double pric, int numC) {
        name = n;
        processor = proc;
        price = pric;
        nmColour = numC;
    }

    /** 
     *  Print out tnfo for the item
     */
    public void printSpecs() {
        System.out.println(this.name + " - " + currency.format(this.price));
    }

    public String toString() {
        return this.name + " - " + currency.format(this.price);
    }
    
}


/*
Name [Price]
Colours: 
    x
    y
    z
*/