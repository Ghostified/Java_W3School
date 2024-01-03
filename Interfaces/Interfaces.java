public class Interfaces {


    //create interface
    interface Animal{
        public void animalSound () ; //interface method has no body
        public void sleep();
    }
    //Horse class implements the Animal Interface
    class Horse implements Animal {
        public void animalSound() {
            //the body opf the method animal sound() is provided
            System.out.println("The horse Neighs");
        }
        public void sleep () {
            //the body of the sleep () is provided here
            System.out.println("Zzzz");
        }
    }
}
