/**
 * Watch.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * 
 */
public class Watch extends Product {

    private int numColors;
    private int numDisplaySizes;
    private String[] colors = new String[numColors];
    private String processor;
    
    private double weight;
    private double[] size = new double[3];
    private double[] displaySize = new double[numDisplaySizes];


    public Watch(String n, double p, int numColors, int numDisplaySizes, String processor, double weight, double length, double width, double height) {
        super(n, p);
        this.numColors = numColors;
        this.numDisplaySizes = numDisplaySizes;
        this.processor = processor;
        this.weight = weight;
        this.size[0] = length;
        this.size[1] = width;
        this.size[2] = height;
    }
}


/*
Apple Watch Series 5 [$529+]
Colours: 
    Silver
    Space Grey
    Gold
    Titanium
    Space Black
    Ceramic
Display Size:
    40mm
    44mm
Weight & Size:
    30.8 g
    40 x 34 x 10.74
Processor:
    S5
*/