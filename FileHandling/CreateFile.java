package FileHandling;

//Program to craete a new file in java
//using the createNewFile() method , returns boolean

import java.io.*;

public class CreateFile {

    public static void main (String [] Args) {
         try {
            File myObject = new File("Filename.txt");
            if (myObject.createNewFile()) {
                System.out.println("File created: " + myObject.getName());
            } else {
                System.out.println("File already exists");
            }
         } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
         }
    }

}
