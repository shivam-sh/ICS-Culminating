/**
 * Mac.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * Store information about Mac based processors
 */
public class Mac extends Product {

    private static final long serialVersionUID = 1L;

    private String[] processors;
    private String[] memory;
    private String[] graphics;
    private String[] storage;
    private String[] colours;

    private double weight;
    private double displaySize;
    private double[] size = new double[3];


    /**     Create new type of Mac device
     * @param name      [String]    - Name of iOS device
     * @param price     [double]    - Price of iOS device   
     * @param nCO       [int]       - Number of colour options
     * @param nPO       [int]       - Number of processor options
     * @param nMO       [int]       - Number of memory options
     * @param nGO       [int]       - Number of graphics options
     * @param nSO       [int]       - Number of storage options     
     * @param display   [double]    - Display size
     * @param length    [double]    - Length of product (cm)
     * @param width     [double]    - Width of product (cm)
     * @param height    [double]    - Height of product (cm)
     * @param weight    [double]    - Weight of product (kilograms)
     */
    public Mac(String name, double price, int nCO, int nPO, int nMO, int nGO, int nSO, double display, double length, double width, double height, double weight) {
        super(name, price, nCO);

        this.displaySize = display;
        this.size[0] = length;
        this.size[1] = width;
        this.size[2] = height;
        this.weight = weight;

        processors = new String[nPO];
        memory = new String[nMO];
        graphics = new String[nGO];
        storage = new String[nSO];
        colours = new String[nCO];

        System.out.println(processors.length);
    }

    /**
     * @param c     [String]           -Name of the colour option that wants to be added
     */
    public void addColourOption(String c) {
        boolean searching = true;
        for (int i = 0; i < colours.length && searching; i++) {
            if (colours[i] == null) {
                colours[i] = c;

                searching = false;
            }
        }
    }

    /**
     * @param p     [String]           -Name of the processor option that wants to be added
     */
    public void addProcessorOption(String p) {
        boolean searching = true;
        for (int i = 0; i < processors.length && searching; i++) {
            if (processors[i] == null) {
                processors[i] = p;

                searching = false;
                System.out.println("processors" + i);
            }
        }
    }

    /**
     * @param m     [String]           -Name of the memory option that wants to be added
     */
    public void addMemoryOption(String m) {
        boolean searching = true;
        for (int i = 0; i < memory.length && searching; i++) {
            if (memory[i] == null) {
                memory[i] = m;

                searching = false;
            }
        }
    }

    /**
     * @param g     [String]           -Name of graphics option that wants to be added
     */
    public void addGraphicsOption(String g) {
        boolean searching = true;
        for (int i = 0; i < graphics.length && searching; i++) {
            if (graphics[i] == null) {
                graphics[i] = g;

                searching = false;
            }
        }
    }

    /**
     * @param s     [String]           -Name of the storage option that wants to be added
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
     * Print out the detailed specs for the device
     */
    public void printSpecs() {
        System.out.println(super.toString() + "\nProcessor:");
        for (int i = 0; i < this.processors.length; i++) {
            System.out.println("\t" + this.processors[i]);
        }

        System.out.println("Memory:");
        for (int i = 0; i < memory.length; i++) {
            System.out.println("\t" + this.memory[i]);
        }

        System.out.println("Graphics:");
        for (int i = 0; i < graphics.length; i++) {
            System.out.println("\t" + this.graphics[i]);
        }

        System.out.println("Storage:");
        for (int i = 0; i < storage.length; i++) {
            System.out.println("\t" + this.storage[i]);
        }

        System.out.println("Colours:");
        for (int i = 0; i < colours.length; i++) {
            System.out.println("\t" + this.colours[i]);
        }

        System.out.println("Display Size:");
        System.out.println("\t" + displaySize + "\"");

        System.out.println("Weight & Size:");
        System.out.println("\t" + this.weight + " kg");
        System.out.println("\t" + this.size[0] + "cm x " + this.size[1] + "cm x " + this.size[2] + "cm");
    }

    /**
     * @return          [int]             -Returns the number of processor options
     */
    public int numProcessors() {
        return processors.length;
    }
}

/*
Mac Pro [$7,499]
Processor:
    8-Core 3.5GHz Intel Xeon W
    12-Core 3.3GHz Intel Xeon W     + $1,200
    16-Core 3.2GHz Intel Xeon W     + $2,400
    24-Core 2.7GHz Intel Xeon W     + $7,200
    28-Core 2.5GHz Intel Xeon W     + $8,400
Memory:
    32 GB
    48 GB   + $360
    96 GB   + $1,200
    192 GB  + $3,600
    384 GB  + $7,200
    768 GB  + $16,800
    768 GB  + $12,000
    1.5 TB  + $30,000
Graphics:
    AMD Radeon Pro 580X
    AMD Radeon Pro Vega II (32GB HBM2)              + $2,880
    Two AMD Radeon Pro Vega II (32GB HBM2)          + $6,240
    AMD Radeon Pro Vega II Duo (2 x 32GB HBM2)      + $6,240
    Two AMD Radeon Pro Vega II Duo (2 x 32GB HBM2)  + $12,960
Storage:
    256 GB
    1 TB    + $480
    2 TB    + $960
    4 TB    + $1,680
Colours: 
    Silver
Display Size:
    0.0"
Weight & Size:
    18.0 kg
    52.9 x 45.0 x 21.8
*/
