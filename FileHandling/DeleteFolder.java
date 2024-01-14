package FileHandling;

//porogram to dlete folder using the delete() method
//note: folder must be empty
import java.io.*;
public class DeleteFolder {

    public static void main(String[] args) {
        File myObject = new File("\"C:\\Users\\allan.branson\\Projects\\Test\"");
        if (myObject.delete()) {
            System.out.println("Deleteted the folder:" +myObject.getName());
        } else {
            System.out.println("Failed to delete the folder");
        }

    }

}
