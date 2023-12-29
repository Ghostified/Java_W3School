public class ClassMethods {
    //static methods can be accessed without creating a class
    //public methods can only be instantated by creating objects


    static void myMethod () { //Creating a method
        System.out.println("This is a method");
    }

    //Example oif public methods 
    public void publicMethod () {
        System.out.println("Public methods ");//
    }

    public static void main (String [] Args) {
        myMethod(); //accessing the static method

        ClassMethods object = new ClassMethods(); //creating an object
        object.publicMethod(); //calling a public method, can only be done with objects
    }
}
