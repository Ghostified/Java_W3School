//data abstraction is the process of hiding certain details and showing only essential information
//data abstraction can be achieved using abstract classes
//Abstract key word is a non access modifier used for classes and methods
//Abstract class = a restricted class that can not be used to create objects, (To access it it must be inherited from another class)
//Abstract methods = can only be used in abstract class , and it does not have nay body , the body is provided bu=y the subclass (Inherited from)
//

//abstract class
abstract class Animal {
    //abstract method has no body 
    public abstract void animalSound ();
    //regular method 
    public void sleep () {
        System.out.println("Zzzz");
    }
}

//subclass inherits from Animal
class Dog extends Animal {
    public void animalSound () {
        //The body of the animalSound() is provided here
        System.out.println("The dog barks Bow Wow");
    }
}

class AbstractClassAccess {
    public static void main (String [] Args) {
        Dog myDog = new Dog(); //create a dog object
        myDog.animalSound();
        myDog.sleep();
    }
}
