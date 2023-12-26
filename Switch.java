import java.util.*;
public class Switch {
   public static void main (String [] args) {

    Scanner scanner = new Scanner(System.in);

    try{
        System.out.println("Enter a number: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;
            
            default:
            if ( day < 1 || day > 5 ){
             System.out.println("Enter a valid number between 1-7");
            }
            break;
        }
    }
    catch (InputMismatchException e){
        System.out.println("Enter a valid number");
    }finally {
        scanner.close();
    }

   } 
}
