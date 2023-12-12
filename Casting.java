/* Type casting is a process in jave used for assigning one type of primitive data type
 * to another type of primitive data tytpe
 * Narrowing type casting assigns   a larger data type to a smaller data type
 * eg: long to int
 * Wideniing type casting is an automatic process of assigning a smaller data type
 * to a larger data type e.g double to float 
 * 
 * Primitive data types vs non primitive data types;
 * Non primitive data types have methods  that can be used to perform operations
 * Primitive data types must have a value, non- primitive can be null
 * Primitive data types have to be declared with a Capital, non primitive in small
 * primitive data types are already defined in java e.g int, while non primitive have to be defined by the programmer except for Strings
 * 
*/
public class Casting {

    //Widening casting example:
    public static void main (String [] args){
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing casting example
        double doubleTwo = 9.789;
        int intTwo = (int) doubleTwo;
        System.out.println(doubleTwo);
        System.out.println(intTwo);

    }
    
}
