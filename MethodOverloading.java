
public class MethodOverloading {
    //method overloading
    //multiple methods can have the same name but with diffrent parameters

    //Declaring Two methods with diffrent names
    static int plusMethodInt (int x, int y) {
      return x + y;  
    }

    static double plusMethodDouble (Double x, Double y ){
        return x + y;
    }

    static int plusMethod(int a, int b) {
        return a + b;
    }

    static Double plusMethod (Double a , Double b) {
        return a + b;
    }

    public static void main (String[] Args){
        int num1 = plusMethodInt(8, 5);
        double num2 = plusMethodDouble(4.5 , 6.4);
        System.out.println("int: " + num1);
        System.out.println("Double: " + num2);
        System.out.println("\n");


        //Method overiding
        int myNum1 = plusMethod(8, 5);
        Double myNum2 = plusMethod(9.5, 8.5);
        System.out.println(plusMethod(num1, myNum1));
        System.out.println("int: " + myNum1);
        System.out.println("Double: " + myNum2);


    }
}
