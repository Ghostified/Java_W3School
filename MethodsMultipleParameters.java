public class MethodsMultipleParameters {
    
    static void myMethod (String firstName, String lastName, int age) {
        System.out.println(firstName + " " + lastName + " is " + age + " years old");
    }

    //method with return values
    //if a method uses VOID it does not return a value
    //primitive datatypes (char, int, bool) can be returned with a return key word on the method

    static int methodTwo (int x) {
        return 10 + x;
    }

    //method with two parameters
    static int methodThree (int a , int b) {
        return a + b;
    }
    
    //method with an if else statement
    static void hogwartsAdmission (int age){ //create a method with an integer variable age

        if (age < 11 ) {
            System.out.println("Access Denied to Hogwarts");
        }
        else {
            System.out.println("You have been admitted to Hogwarts");
        }
    }


    public static void main (String[]Args) {
        myMethod ("Hermione", "Granger", 20);
        myMethod ("Harry", "Potter", 17);

        //Calling method two 
        System.out.println("\n");
        System.out.println(methodTwo(10));//outputs 20
        System.out.println("\n");

        //Calling methodThree
        System.out.println(methodThree(20, 30)); //outputs 50
        System.out.println("\n");

        //method storing the result in variable 
        System.out.println("\n");
        int c = methodThree(100, 200);
        System.out.println(c);

        //Method to check your hogwarts admission
        System.out.println("\n");
        //System.out.print(" Admission status: " + hogwartsAdmission(11);
        hogwartsAdmission(9);



    }
}
