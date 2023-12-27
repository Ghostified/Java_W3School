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

    public static void main (String[] Args) {
        myMethod();
        myMethod();
        myMethod();
    }
}
