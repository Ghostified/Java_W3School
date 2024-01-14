package JavaHowTo;

import java.util.Scanner;

/*
  * Program to reverse a string
  */
public class ReverseString {

    public static void main (String[]Args) {
        String words;
        String reversedString = " ";
        
        Scanner myObject = new Scanner(System.in);
        System.out.println("Enter a string:");
        words = myObject.nextLine();

        for (int i =0; i < words.length();i++){
            reversedString = words.charAt(i) + reversedString;
        }
        System.out.println("Reversed String: " + reversedString);
    }
}
