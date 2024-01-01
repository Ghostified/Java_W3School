abstract class AbstractMethod {
    //an abstract method belongs toan abstract class , and it does not have a body
    //The body is provided by the subclass
    //Example

    public String fname = "John";
    public int age = 24;
    public abstract void study (); //abstract method

    //Subclass (Inherits from main)
    class Student extends AbstractMethod {
        public int graduationYear = 2018;
        public void study () {
            System.out.println("Study all night long");
        }
    }
    // class Second {
    //     public 
    // }
}
