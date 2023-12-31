public class StaticMethods {
    //staticmethods can be accessed without creating an object of the class , unlike public
    //Static method example

    static void myStaticMethod () {
        System.out.println("static methods can be called without creating an object");
    }
    //public methods
    //Can only be instantiated by creating objects
    public void myPublicMethod () {
        System.out.println("Public methods MUST be called by creating and Object");
    }

    //main method
    public static void main (String [] Args) {
        myStaticMethod(); //calls the static method
        //myPublicMethod(); //This line outputs an error

        //Calling a public method
        StaticMethods myObject = new StaticMethods();
        myObject.myPublicMethod();


    }
}
