public class Methods {
    //Methods are codes that run when called
    //It must be declared within a class followed by parenthesis
    //e.g static void myMethod (){}

    //static: belongs to the main class and not an object of the class
    //void : shows the method does not have a return value
    //myMethod : method name

    //Example: 

    static void myMethod () { //create method
        System.out.println("Java is awesome");
    }

    //Method with parameters
    static void methodTwo (String firstName) {
        System.out.println(firstName + "Second name");
    }

    public static void main (String[] Args) {
        myMethod();
        myMethod();
        myMethod();

        //Method Parameters
        //Parameters can be passed into a method as variables
        //Multiple Parameters are specified in the parantheses inside the method

        methodTwo("James ");
        methodTwo("Bond ");

    }
}
