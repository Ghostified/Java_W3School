public class Animals {
    //Polymorphosm = many forms
    //occurs when many classes are related through inheritance
    //Inheritance = inherit attributes and methods , polymorphism is the use of inherited methods to perform diffrent tasks
    //Example 
    static class Animal {
    public void animalSound () {
        System.out.println ("The animal makes a sound: ");
    }
}

static  class Pig extends Animal {
    public void animalSound () {
        System.out.println("The pig says wee wee");
    }
 }
  static class Dog extends Animal {
    public void animalSound () {
        System.out.println("The dog says : bow wow");
    }
 }
 static class Main {
     public static void main(String [] Args){
       Animal myAnimal = new Animal();//Create an animals object
        Animal myPig = new Pig() ; //Create a myPig Object
        Animal myDog = new Dog (); // Create a myDog Object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

 }
 }
}
