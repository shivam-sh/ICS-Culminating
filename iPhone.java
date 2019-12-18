/**
 * iPhone.java
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * 
 */
public class iPhone extends Product {
    protected int numColour;
    private String[] colours = new String[numColour];
    private String camera;
    private int numCapacities;
    private String[] capacities = new String[numCapacities];
    private double displaySize;
    private double weight;
    private double height;
    
}


    

   public iPhone(String n, String proc, double pric, int numC, int ) {
        super(n, proc, pric, numC);

        
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