/**
 * Mac.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * 
 */
public class Mac extends Product {
    
    private int numProcessorOptions;
    private int numMemoryOptions;
    private int numGraphicsOptions;
    private int numStorageOptions;
    private int numColourOptions;

    private String[] processors = new String[numProcessorOptions];
    private String[] memory = new String[numMemoryOptions];
    private String[] graphics = new String[numGraphicsOptions];
    private String[] storage = new String[numStorageOptions];
    private String[] colours = new String[numColourOptions];

    private double weight;
    private double[] size = new double[3];


    public Mac(String n, double p, int nPO, int nMO, int nGO, int nSO, int nCO, int weight, int length, int width, int height) {
        super(n, p);
        this.numColourOptions = nCO;
        this.numProcessorOptions = nPO;
        this.numMemoryOptions = nMO;
        this.numGraphicsOptions = nGO;
        this.numStorageOptions = nSO;
        this.weight = weight;
        this.size[0] = length;
        this.size[1] = width;
        this.size[2] = height;
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
Weight & Size:
    18.0 kg
    52.9 x 45.0 x 21.8
*/
