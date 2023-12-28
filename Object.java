public class Object {
    int a = 5; //class attribute one
    int b = 6; //class atrribute two
    int c; //class attribute three
    String firstName = "Harry";
    String lastName = "Potter";

    public static void main(String[]Args){
        Object one = new Object();
        Object two = new Object();
        one.b = 50; //overides the attribute of an object
        System.out.println(one.a *one.b);
        two.c = 40; //modifies the attribute of object two
        System.out.println("\n");

        //Inheritance
        // illustrates that an object can inherit the attributes of the class
        System.out.println(two.c + one.b + one.a * two.a * one.c);
        System.out.println(two.a);
        System.out.println(two.b);
        System.out.println(two.c);
        System.out.println(one.a);
        System.out.println(one.b);
        System.out.println(one.c);

        System.out.println("\n");
        System.out.println("Name: " + one.firstName + " " + two.lastName);
        System.out.println("Age: " + two.c);

    }
}
