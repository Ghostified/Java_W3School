//package JavaHowTo;

import java.util.Scanner;

public class SumOfArrayElements {

    public static void main(String[] Args) {
        int [] myArray = {3,4,5,6,7};
        int sum = 0;
        int i;

        //loop through the array and store the sum in the sum variable
        for(i =0; i < myArray.length;i++) {
            sum += myArray[i];
        }

        System.out.println("The sume is : " + sum);

        //check if an number is even or odd
        int number;
        Scanner myObject = new Scanner(System.In);
        System.out.println("Enter a numbner ");
        number = myObject.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        }
        
    }

