//Program to add to numbers from user input

import java.util.*;

public class AddTwoNumbers{
public static void main (String[] Args) {
 
    int num1;
    int num2;
    int sum;
    String words;

    Scanner myObject = new Scanner(System.in);
    System.out.println("Type a number: ");
    num1 = myObject.nextInt();

    System.out.println("Enter a second number");
    num2 = myObject.nextInt();

    myObject.nextLine();
    
    sum = num1 + num2;
    System.out.println("The result is: " + sum);

    //count words in a string from user input
    System.out.println("Enter a string");
    words =myObject.nextLine();

    int countWords = words.split("\\s").length;
    System.out.println("Number of words: " +countWords);
}
}