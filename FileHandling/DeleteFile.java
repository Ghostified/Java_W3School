package FileHandling;

//using the delete() method to delete a file
import java.io.*;
public class DeleteFile {

    public static void main (String[] Args) {
        File myObject = new File ("filename.txt");
        if (myObject.delete()) {
            System.out.println("Deleted the file: " + myObject.getName());
        } else {
            System.out.println("Failed to delete file");
        }

    }
}
