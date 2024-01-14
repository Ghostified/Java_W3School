package FileHandling;

import java.io.File;

/*
 * Using diffrent methods to get information about a file
 */
public class GetFileInfo {

    public static void main (String[] Args) {
        File myObject = new File("filename.txt");
        if (myObject.exists()) {
            System.out.println("File name: " + myObject.getName());
            System.out.println("Absoulte payh: " + myObject.getAbsolutePath());
            System.out.println("Writeable: " + myObject.canWrite());
            System.out.println("Readable: " + myObject.canRead());
            System.out.println("File size in bytes: " + myObject.length());
        } else {
            System.out.println("The file does not exist. ");
        }
        
    }

}
