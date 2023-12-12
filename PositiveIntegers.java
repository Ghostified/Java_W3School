/*Check if number is odd, even or zero
 * Taking user input
 * Using conditional statements
 */
import java.util.*;

public class PositiveIntegers {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        try{

            System.out.println("Enter a number");
            int num = scanner.nextInt();

            if ( num == 0 && num < 1 ) {
                System.out.println("The number is zero");
            }
            else if (num % 2 == 0) {
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is Odd");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Enter a valid number");
        } 
        finally {
            scanner.close();
        }
    }
}
