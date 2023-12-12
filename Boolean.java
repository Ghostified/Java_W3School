/*Boolean operation using >=
 * Program initializes voting age and checks from the user input if they are within range
*/

import java.util.*;
public class Boolean {
    public static void main(String [] args){

        int votingAge = 25;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age: ");
        int myAge = scanner.nextInt();

        if (myAge >= votingAge){
            System.out.println("You are allowed to vote");
        }
        else{
            System.out.println("You are below the voting age");
        }

    }
}
