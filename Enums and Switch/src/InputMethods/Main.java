package InputMethods;
import java.util.Scanner;

public class Main {
    public static void main (String [] Args) {
        //create scanner object
        Scanner myObject = new Scanner(System.in);
        System.out.println("Enter a user name");

        //read user input
        String userName = myObject.nextLine();

        System.out.println("Enter your age");
        int age = myObject.nextInt();

        System.out.println("Enter your salary");
        double salary = myObject.nextDouble();

        System.out.println("What is the value of pie?");
        float pie = myObject.nextFloat();

        System.out.println ("The user name is: " + userName);
        System.out.println("Your age is : " + age);
        System.out.println("Your pay is : " + salary);
        System.out.println("The value of pie is " + pie);

    }
}
