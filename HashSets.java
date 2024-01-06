import java.util.*;
//Hashsets is a collection where each item is unique unlike ArrayList or LinkedList


public class HashSets {

    public static void main (String [] Args) {

        //create a HashSet
        HashSet<String> carModel = new HashSet<String> () ;

        //Add items to a hashet with ths .add() method
        carModel.add("Mazda");
        carModel.add("Tesla");
        carModel.add("Ford");
        carModel.add("Porsche");
        carModel.add("Astorn Martin");
        carModel.add("Mazda");

        System.out.println(carModel); //note that only one Mazda object will beprinted 

        //Loop through a hashset
        for (String i : carModel) {
            System.out.println(i);
        }

        //Check if a hashset contains an item with the .contain()
        //retirns a boolean value
        System.out.println();
        System.out.println(carModel.contains("Mazda")); //prints true
        System.out.println(carModel.contains("Toyota")); //prints false


        //Creating a hashset of integers
        HashSet<Integer> phoneNumbers = new HashSet< Integer>();

        //Add items in the Hashset
        phoneNumbers.add(100);
        phoneNumbers.add(200);
        phoneNumbers.add(300);
        phoneNumbers.add(400);

        //Printout the  objects stored in  the hashset
        System.out.println("\n");
        System.out.println(phoneNumbers);

        //loop through the hashset 
        System.out.println();
        for (int i = 100; i <= 500; i++) {
            if (phoneNumbers.contains(i)) {
                System.out.println(i + " was found in the set");
            } else {
                System.out.println(i + " was not found in the set ");
            }
        }

    }
}
