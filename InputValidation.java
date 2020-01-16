/**
 * InputValidation.java
 * 
 * Shivam Sharma, Mikayel Sargsyan, Daniel-Mao Mitchell
 * 13/11/19
 * ICS 4U   NHSS
 * 
 * To manage the system that stores all of the products
 */
public class InputValidation {

    public static int Int(String s) {
        int num = 0;
        try {
            num = Integer.parseInt(s);
        } catch(Exception e) {
            num = 69;
        }
        return num;
    }

    public static double Double(String s) {
        double num = 0;
        try {
            num = Double.parseDouble(s);
        } catch(Exception e) {
            num = 69;
        }
        return num;
    }

    public static long Long(String s) {
        long num = 0;
        try {
            num = Long.parseLong(s);
        } catch(Exception e) {
            num = 0;
        }
        return num;
    }
}