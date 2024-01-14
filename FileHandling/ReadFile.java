package FileHandling;
import java.io.*;
import java.util.*;

/*
 * Program that reads a file
 */

public class ReadFile {

    public static void main (String[]Args) {
        try {
            File myObject = new File("filename.txt");
            Scanner myReader = new Scanner(myObject);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
