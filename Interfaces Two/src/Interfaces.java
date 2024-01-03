public class Interfaces {
    // Create interface
    interface Animal {
        void animalSound(); // Interface method has no body
        void sleep();
    }

    // Horse class implements the Animal Interface
    static class Horse implements Animal {
        public void animalSound() {
            // The body of the method animalSound() is provided
            System.out.println("The horse Neighs");
        }

        public void sleep() {
            // The body of the sleep() is provided here
            System.out.println("Zzzz");
        }
    }
}
