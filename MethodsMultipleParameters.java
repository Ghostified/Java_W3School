public class MethodsMultipleParameters {
    
    static void myMethod (String firstName, String lastName, int age) {
        System.out.println(firstName + " " + lastName + " is " + age + " years old");
    }

    public static void main (String[]Args) {
        myMethod ("Hermione", "Granger", 20);
        myMethod ("Harry", "Potter", 17);
    }
}
