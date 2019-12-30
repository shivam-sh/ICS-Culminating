/**
 * iPhone.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * 
 */
public class iPhone extends Product {
    private int numCapacities;
    protected int numColour;

    private double displaySize;
    private double weight;
    private double height;

    protected String processor;
    private String camera;

    private String[] colours = new String[numColour];
    private String[] capacities = new String[numCapacities];

   public iPhone(String n, doube p, int numCap, int numCol, double DS, double w, double h, String proc, String cam, String[] col, String[] cap ) {
        super(n, p);
        this.numCapacities = numCap;
        this.numColour = numCol;
        this.displaySize = DS;  ///Why Is This So Annoying
        this.weight = w;
        this.height = h;
        this.processor = proc;
        this.camera = cam;
        this.colours = col;
        this.capacities = cap;
    }
    


}

/*
iPhone 11 Pro Max [$1,519+]
Colours: 
    Midnight Green
    Silver
    Space Grey
    Gold
Display Size:
    6.5"
Camera:
    Triple 12MP Stovetop
Capacities:
    64 GB
    256 GB
    512 GB
Weight & Size:
    226 g
    158 x 77.8 x 8.1
Processor:
    A13
*/