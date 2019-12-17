/**
 * iPad.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * 
 */
public class iPad extends Product {
    
    private int numColourOptions;
    private int numStorageOptions;

    private String[] colours = new String[numColourOptions];
    private String[] storage = new String[numStorageOptions];
    private String camera;
    private String processor;

    private double weight;
    private double[] size = new double[3];
    private double displaySize;



    /**     Create new type of iPad
     * @param n
     * @param p
     * @param nCO
     * @param nSO
     * @param cam
     * @param cpu
     * @param display
     * @param length
     * @param width
     * @param height
     * @param weight
     */
    public iPad(String n, double p, int nCO, int nSO, String cam, String cpu, double display, double length, double width, double height, double weight) {
        super(n, p);
        this.camera = cam;
        this.processor = cpu;
        this.size[0] = length;
        this.size[1] = width;
        this.size[2] = height;
        this.displaySize = display;
        this.weight = weight;
    }

    /**     Print out the detailed specs for the device
     */
    public void printSpecs() {
        System.out.println(super.toString() + "\nStorage:");
        for (int i = 0; i < numStorageOptions; i++) {
            System.out.println("\t" + storage[i]);
        }

        System.out.println("Colours:");
        for (int i = 0; i < numColourOptions; i++) {
            System.out.println("\t" + colours[i]);
        }

        System.out.println("Camera:\n\t" + this.camera);
        System.out.println("Display Size:\n\t" + this.displaySize + "\"");
        System.out.println("Weight & Size:\n\t" + this.weight + "g\n\t" + this.size[0] + "mm x " + this.size[1] + "mm x " + this.size[3] + "mm");
        System.out.println("Processor:\n\t" + processor);
    }
/*
iPad Pro (11-inch)    [$999+]
Storage:
    64 GB
    256 GB
    512 GB
    1 TB
Colours: 
    Silver
    Space Grey
Camera:
    12MP
Display Size:
    11.0"
Weight & Size:
    468 g
    247.6 x 178.5 x 5.9
Processor:
    A12X
*/


    //  ACCESSORS AND MUTATORS

    public String getCamera() {
        return this.camera;
    }
    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getProcessor() {
        return this.processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getLength() {
        return this.size[0];
    }
    public void setLength(double length) {
        this.size[0] = length;
    }

    public double getWidth() {
        return this.size[0];
    }
    public void setWidth(double width) {
        this.size[0] = width;
    }

    public double getHeight() {
        return this.size[3];
    }
    public void setHeight(double height) {
        this.size[3] = height;
    }

    public double getDisplaySize() {
        return this.displaySize;
    }
    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumColours() {
        return this.numColours;
    }
    public void setNumColours(int numColours) {
        this.numColours = numColours;
    }

    public int getNumStorage() {
        return this.numStorage;
    }
    public void setNumStorage(int numStorage) {
        this.numStorage = numStorage;
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