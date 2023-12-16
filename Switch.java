import java.util.*;
public class Switch {
   public static void main (String [] args) {

    Scanner scanner = new Scanner(System.in);

    try{
        System.out.println("Enter a number: ");
        int day = scanner.nextInt();

        switch (day == 1) {
            case 1:
            System.out.println("Monday");
            break;
            default:
            System.out.println("Not a valid number ");

        }
    }
    catch (InputMismatchException e){
        System.out.println("Enter a valid number");
    }

   } 
}
