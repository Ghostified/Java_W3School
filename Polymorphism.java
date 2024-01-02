class Animal {
    public void animalSound () {
        System.out.println("The animal makes a sound");
    }
}
class Pig extends Animal {
    public void animalSound () {
       System.out.println("The pig says Hoink"); 
    }
}

class Dog extends Animal {
    public void animalSound () {
        System.out.println("The Dog says Bow Wow");
    }
}

public class Polymorphism  extends Animal {
    public static void main (String [] Args) {
        Animal myAnimal = new Animal (); //Create an animal Object
        Animal myPig = new Pig (); //create a new pig object
        Animal myDog = new Dog ();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
