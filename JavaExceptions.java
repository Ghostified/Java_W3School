//Try and catcch are used to define a block of code to be tested 
//Try = defines the block of code
//catch = statement allows defines code to be executed if an error occurs in the block 
//syntax
/*
 * try {
 * // block of code to try
 * }
 * catch (Exception e) {
 * //Block of code to handle the error
 * }
 */


public class JavaExceptions {

     private static void  checkAge (int age) {
        if (age < 18 ){
            throw new ArithmeticException("Access denied : You are underage");
        }
        else {
            System.out.println("Access granted");
        }
     }

    public static void main(String[] args) {
        //int checkAge = 18;
        try {
            int [] myNumbers = {5,6,7,8,};
            System.out.println(myNumbers[23]); //trys to print the value at index 10 not available in the array
        }
        catch (Exception e){
            System.out.println("Something went awfully wrong");
        }

        //the finally statement executes the code after the try and catch regardless
         finally {
            System.out.println("The try and catch is over");
         }

         checkAge(15);
        //Throw keyword allows one to create a custom error 
        //it is used with exception types  e.g Arithmetic exception, Filenot found exception etc
    }
}
    

