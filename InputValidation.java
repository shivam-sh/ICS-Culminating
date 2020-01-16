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

    /**
     * @param s     [String]           -A user input that needs to be checked if it is an integer
     * @return      [int]              -If user input is an integer, returns the value as an int data type
     */
    public static int Int(String s) {
        int num = 0;
        try {
            num = Integer.parseInt(s);
        } catch(Exception e) {
            num = 69;
        }
        return num;
    }

    /**
     * @param s     [String]           -A user input that needs to be checked if it is a double
     * @return      [double]           -If user input is a double, returns the value as a double data type
     */
    public static double Double(String s) {
        double num = 0;
        try {
            num = Double.parseDouble(s);
        } catch(Exception e) {
            num = 69;
        }
        return num;
    }

    /**
     * @param s     [String]           -A user input that needs to be checked if it is a double
     * @return      [long]             -If user input is a long, returns the value as a long data type
     */
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