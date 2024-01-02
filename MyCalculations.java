 class Calculations {
    //Copde to demonstrate inheritance 
    int z;
    public void addition (int x , int y) {
        z = x + y;
        System.out.println("The sum of given numbers is: " + z);
    }
    public void Substraction (int x, int y) {
        z = x - y;
        System.out.println("The diffrence between the given numbers: " + z);
    }
}
 public class MyCalculations extends Calculations {
    public void multiplication (int x, int y) {
        z = x * y;
        System.out. println ("The product of the given numbers : " + z);
    }
     public static void main (String [] Args) {
        int a = 20,  b = 10;
        MyCalculations demo = new MyCalculations();
        demo.addition(a, b);
        demo.Substraction(a, b);
        demo.multiplication(a,b);
     }
 }