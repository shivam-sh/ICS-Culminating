/**
 * @author Shivam Sharma
 * Graphics.java
 * @version 1.0
 */


public class Graphics {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void Logo() {
        System.out.println( ANSI_CYAN + "\n" +
                            "               ##\n" + 
                            "             ####\n" + 
                            "            ####\n" + 
                            "            ##\n" + 
                            ANSI_GREEN +
                            "    ######     ######\n" + 
                            "  #####################\n" + 
                            " ####################\n" + 
                            ANSI_YELLOW +
                            "###################            TTT  H H  III  N N  K K \n" + 
                            "###################             T   HHH   I   NNN  KK  \n" + 
                            "###################             T   H H  III  N N  K K \n" + 
                            ANSI_RED + 
                            "#####################          DD  III FFF FFF EEE RRR EEE N N TTT \n" + 
                            " ######################        D D  I  FF  FF  EE  RRR EE  NNN  T  \n" + 
                            "  ####################         DD  III F   F   EEE R R EEE N N  T  \n" + 
                            ANSI_PURPLE +
                            "   #################\n" + 
                            "     #####   #####\n");

                            try {
                                Thread.sleep(2000);
                            } catch (Exception e) {
                                //TODO: handle exception
                            }
    }

    public static void Divider() {
        System.out.println(ANSI_BLUE + "\n" +
        "▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅\n"
        );
        
    }

    public static void Exit() {
        System.out.println( ANSI_YELLOW + "\n" +
            "  GGG    OOO    OOO   DDDD   BBBB   Y   Y  EEEEE   \n" +
            " G      O   O  O   O  D   D  B   B   Y Y   E       \n" +
            " G   G  O   O  O   O  D   D  BBBB     Y    EEEE    \n" +
            " G   G  O   O  O   O  D   D  B   B    Y    E       \n" +
            "  GGG    OOO    OOO   DDDD   BBBB     Y    EEEEE   \n"
        );        
    }
}