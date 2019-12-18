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
    
    protected int numColours;
    protected String[] colours = new String[numColours];

    public NumberFormat currency = NumberFormat.getCurrencyInstance();

    /** Create a new product type
     * @param name          [String] - Name of product
     * @param price         [double] - Price of product (CAD)
     * @param numOfColours  [int]    - Number of colour options available
     */
    public Product(String name, double price, int numOfColours) {
        this.name = name;
        this.price = price;
        this.numColours = numOfColours;
    }

    /** 
     *  Print out info for the item
     */
    public void printSpecs() {
        System.out.println(this.name + " [" + currency.format(this.price) + "]");
    }

    /**
     *  @return     [String] - Name and price of product
     */
    public String toString() {
        return this.name + "[" + currency.format(this.price) + "]";
    }
    
}


/*
Name [Price]
Colours: 
    x
    y
    z
*/