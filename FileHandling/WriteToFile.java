//the File writer class is used together with the write() method to write some text into a file


import java.io.*;


//package FileHandling;

public class WriteToFile {
    public static void main (String[]Args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write ("File in java are tricky but fun enough, weeping emoji");
            myWriter.close();
            System.out.println("Successfully wrote into a file");
        } catch (IOException e) {
            System.out.println("An error has occured ");
            e.printStackTrace();
        }
    }
}
