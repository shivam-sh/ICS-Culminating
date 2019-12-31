/**
 * TV.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * 
 */
public class TV extends Product {

    private int numColourOptions;
    private int numStorageOptions;

    private String[] colours = new String[numColourOptions];
    private String[] storage = new String[numStorageOptions];
    private String camera;
    private String processor;

    private double weight;
    private double[] size = new double[1];
    private double displaySize;


    public TV(String n, double p,int nCO,int nSO, String cpu, double length, double width, double height, double weight) {
        super(n, p);
       
    }

    
}

/*
Apple TV 4K [$229+]
Colours: 
    Space Black
Weight & Size:
    425.0 g
    35 x 98 x 98
Processor:
    A10X Fusion
*/
