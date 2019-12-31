/**
 * Products.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Abstract class based on which all products are saved
 */

 import java.text.NumberFormat;

public abstract class Product {
    private String name;
    private double price;
    private String description;
    
    protected int numColourOptions;
    protected String[] colours = new String[numColourOptions];

    public NumberFormat currency = NumberFormat.getCurrencyInstance();

    /** Create a new product type
     * @param name          [String] - Name of product
     * @param price         [double] - Price of product (CAD)
     * @param numOfColours  [int]    - Number of colour options available
     */
    public Product(String name, double price, int numOfColours) {
        this.name = name;
        this.price = price;
        this.numColourOptions = numOfColours;
    }

    /** 
     *  Print out info for the item
     */
    public void printSpecs() {
    }

    /**
     *  @return     [String] - Name and price of product
     */
    public String toString() {
        return this.name + "[" + currency.format(this.price) + "]";
    }

    public void setDescription(String d) {
        this.description = d;
    }
    public String getDescription() {
        if (this.description == null) {
            return "no description available";
        } 
        return this.description;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }
}


/*
Name [Price]
Colours: 
    x
    y
    z
*/