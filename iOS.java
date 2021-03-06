/**
 * iPad.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Store information about iOS based devices
 */

 import java.io.Serializable;

public class iOS extends Product implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private int numStorageOptions;

    private String[] storage;
    private String camera;
    private String processor;

    private double weight;
    private double[] size = new double[3];
    private double displaySize;



    /**     Create new type of iOS device
     * @param name      [String]    - Name of iOS device
     * @param price     [double]    - Price of iOS device
     * @param nCO       [int]       - Number of colour options
     * @param nSO       [int]       - Number of storage options
     * @param cam       [String]    - Camera information
     * @param cpu       [String]    - Processor used in product
     * @param display   [double]    - Display size (inches)
     * @param length    [double]    - Length of product (mm)
     * @param width     [double]    - Width of product (mm)
     * @param height    [double]    - Height of product (mm)
     * @param weight    [double]    - Weight of product (grams)
     */
    public iOS(String name, double price, int nCO, int nSO, String cam, String cpu, double display, double length, double width, double height, double weight) {
        super(name, price, nCO);
        this.numStorageOptions = nSO;
        this.camera = cam;
        this.processor = cpu;
        this.size[0] = length;
        this.size[1] = width;
        this.size[2] = height;
        this.displaySize = display;
        this.weight = weight;

        storage = new String[numStorageOptions];
    }

    /**
     * @param s     [String]           -Name of colour that wants to be added
     */
    public void addColourOption(String s) {
        boolean searching = true;
        for (int i = 0; i < colours.length && searching; i++) {
            if (colours[i] == null) {
                colours[i] = s;

                searching = false;
            }
        }
    }

    /**
     * @param s     [String]            -Value of the storage option that wants to be added
     */
    public void addStorageOption(String s) {
        boolean searching = true;
        for (int i = 0; i < storage.length && searching; i++) {
            if (storage[i] == null) {
                storage[i] = s;

                searching = false;
            }
        }
    }

    /**
     * @return      [int]                -Return number of storage options
     */
    public int numStorageOption() {
        return numStorageOptions;
    }

    /**     Print out the detailed specs for the device
     */
    public void printSpecs() {
        System.out.println(super.toString() + "\nStorage:");
        for (int i = 0; i < this.storage.length; i++) {
            System.out.println("\t" + this.storage[i]);
        }

        System.out.println("Colours:");
        for (int i = 0; i < this.colours.length; i++) {
            System.out.println("\t" + this.colours[i]);
        }

        System.out.println("Camera:\n\t" + this.camera);
        System.out.println("Display Size:\n\t" + this.displaySize + "\"");
        System.out.println("Weight & Size:\n\t" + this.weight + "g");
        System.out.println("\t" + this.size[0] + "mm x " + this.size[1] + "mm x " + this.size[2] + "mm");
        System.out.println("Processor:\n\t" + this.processor);
    }
}

/*
iPad Pro 11-inch [$999+]
Colours: 
    Silver
    Space Grey
Display Size:
    11.0"
Camera:
    12MP
Capacities:
    64 GB
    256 GB
    512 GB
    1 TB
Weight & Size:
    468 g
    247.6 x 178.5 x 5.9
Processor:
    A12X
*/