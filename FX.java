
/**
 * @author Shivam Sharma
 * FX.java
 * @version 1.0
 */

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class FX {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void Bootup() {
        System.out.println(
            ANSI_CYAN + "\n" +
            "                ##\n" + 
            "              ####\n" + 
            "             ####\n" + 
            "             ##\n" + 
            ANSI_GREEN +
            "     ######     ######\n" + 
            "   #####################\n" + 
            "  ####################\n" + 
            ANSI_YELLOW +
            " ###################            TTT  H H  III  N N  K K \n" + 
            " ###################             T   HHH   I   NNN  KK  \n" + 
            " ###################             T   H H  III  N N  K K \n" + 
            ANSI_RED + 
            " #####################          DD  III FFF FFF EEE RRR EEE N N TTT \n" + 
            "  ######################        D D  I  FF  FF  EE  RRR EE  NNN  T  \n" + 
            "   ####################         DD  III F   F   EEE R R EEE N N  T  \n" + 
            ANSI_PURPLE +
            "    #################\n" + 
            "      #####   #####\n" +
            ANSI_RESET);

        try {
            Thread.sleep(500);
        } catch (Exception e) {}
                           
        play("Bootup.wav");

        try {
            Thread.sleep(500);
        } catch (Exception e) {}
    }

    public static void Logo() {
        
    }

    public static void Apple() {
        System.out.println(
            "                   _\n" +
            "  __ _ _ __  _ __ | | ___ \n" +
            " / _` | '_ \\| '_ \\| |/ _ \\\n" +
            "| (_| | |_) | |_) | |  __/\n" +
            " \\__,_| .__/| .__/|_|\\___|\n" +
            "      |_|   |_|   \n"
        );       
    }

    public static void Divider() {
        System.out.println(ANSI_BLUE + "\n" +
        "▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅\n" +
        ANSI_RESET);
    }

    public static void Clear() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        FX.Apple();
    }

    public static void Exit() {
        System.out.println( ANSI_RED + "\n" +
            "  GGG    OOO    OOO   DDDD   BBBB   Y   Y  EEEEE   \n" +
            " G      O   O  O   O  D   D  B   B   Y Y   E       \n" +
            " G  GG  O   O  O   O  D   D  BBBB     Y    EEEE    \n" +
            " G   G  O   O  O   O  D   D  B   B    Y    E       \n" +
            "  GGG    OOO    OOO   DDDD   BBBB     Y    EEEEE   \n" +
            ANSI_RESET);        
    }

    /**
     * @param filename      [String]        -Name of the audio file 
     */
    public static void play(String filename){
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(filename)));
            clip.start();
            while (!clip.isRunning())
            Thread.sleep(10);
            while (clip.isRunning())
            Thread.sleep(10);
            clip.close();
        }
        catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }
}