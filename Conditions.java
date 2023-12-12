import java.util.*;
import java.util.InputMismatchException;
public class Conditions {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Enter a number ");
        long num1 = scanner.nextLong();

        if(num1 % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is ODD");
        }
    }
    catch (InputMismatchException e){
        System.out.println("Invalid input");
        }
    finally {
        scanner.close();
    }
}
}
    
