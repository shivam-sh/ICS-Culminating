/**
 * Products.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Abstract class based on which all products are saved
 */

 import java.io.Serializable;
 import java.text.NumberFormat;

public abstract class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private double price;
    private String description;
    private int inventory;
    
    protected int numColourOptions;
    protected String[] colours;

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

        colours = new String[numOfColours];
        inventory = 1000000;
    }

    /** Print out info for the item
     */
    public void printSpecs() {}

    /**
     *  @return     [String]            - Name and price of product
     */
    public String toString() {
        return this.name + "[" + currency.format(this.price) + "]";
    }

    /**
     * @param d     [String]            - Returns the description of the product     
     */
    public void setDescription(String d) {
        this.description = d;
    }

    /**
     * @return      [String]            - Description or specifies if there is no description
     */
    public String getDescription() {
        if (this.description == null) {
            return "no description available";
        } 
        return this.description;
    }
    
    /**
     * @return      [String]            - Returns product name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name  [String]            - Product name
     */
    public void setName(String name) {
        this.name = name;
    }

    public void addInventory(int i) {
        this.inventory += i;
    }

    public void removeInventory() {
        this.inventory--;
    }

    /** 
     * @return      [int]               - Return the inventory
     */
    public int getInventory() {
        return this.inventory;
    }

    /**
     * @return      [double]            - Return the price of the product
     */
    public double getPrice() {
        return this.price;
    }
}


/*
Name [Price]
Colours: 
    x
    y
    z
*/