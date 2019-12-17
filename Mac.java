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
    private String[] processors = new String[numProcessorOptions];
    private String[] memory = new String[numMemoryOptions];
    private String[] graphics = new String[numGraphicsOptions];

    public Mac(String n, double p, int nPO, int nMO, int nGO) {
        super(n, p);
        numProcessorOptions = nPO;
        numMemoryOptions = nMO;
        numGraphicsOptions = nGO;
    }

}

/*
Mac Pro [$7,499 +]
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
    AMD Radeon Pro Vega II      + $
    Two AMD Radeon Pro Vega II  + $
    AMD Radeon Pro Vega II Duo  + $
Storage:
    256 GB
    1 TB    + $
    2 TB    + $
    4 TB    + $
    8 TB    + $
Colours: 
    Silver
Display:
    Not Included
Weight & Size:
    18.0 kg
    52.9 x 45.0 x 21.8
*/