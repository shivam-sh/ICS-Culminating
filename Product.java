/**
 * Products.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
<<<<<<< HEAD
 * 
=======
 * To create a template based on which the product classes are formed
>>>>>>> d6128f82239ccfb34752a09eb6bce1d2a2feeb9e
 */

 import java.text.NumberFormat;

public abstract class Product {
<<<<<<< HEAD
    protected String name;
    protected String processor;
    protected double price;
    protected int numColour;

=======
    private String name;
    private double price;
>>>>>>> d6128f82239ccfb34752a09eb6bce1d2a2feeb9e
    public NumberFormat currency = NumberFormat.getCurrencyInstance();

    /** Create a new product type
     * @param name
     * @param price
     */
<<<<<<< HEAD
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
=======
    public Product(String n, double p) {
        this.name = n;
        this.price = p;
    }

    /** 
     *  Print out info for the item
     */
    public void printSpecs() {
        System.out.println(this.name + "    [" + currency.format(this.price) + "]");
    }

    /**
     * 
     */
    public String toString() {
        return this.name + " [" + currency.format(this.price) + "]";
>>>>>>> d6128f82239ccfb34752a09eb6bce1d2a2feeb9e
    }
    
}


/*
Name [Price]
<<<<<<< HEAD
Colours: 
    x
    y
    z
=======
>>>>>>> d6128f82239ccfb34752a09eb6bce1d2a2feeb9e
*/