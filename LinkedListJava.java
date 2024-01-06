import java.util.Collections;
import java.util.LinkedList;

public class LinkedListJava {
     public static void main(String[] Args ) {
        
        LinkedList <String> cars = new LinkedList<String>();
         cars.add("Volvo");
         cars.add("Mazda");
         cars.add("Toyota");
         cars.add("BMW");
         cars.add("Ford");

         System.out.println(cars);

         // LinkedLists Metods:
         //add an item at the beginning of a linked list
         cars.addFirst("Tesla");
         System.out.println(cars);

         //Add an item at the end of the list 
         cars.addLast("Rivian");  
            System.out.println(cars);
         

         //Get an item at the beginning of the List
         cars.get(0);
         System.out.println(cars.get(0));//prints aitem at index
         System.out.println(cars.getFirst());// get the first item on the linked List
         System.out.println(cars.getLast());// Get the  last item at the end of the list
         //cars.remove(1); //Removes element at Index One


         //Sort through an array list using the collections.sort ( ) method
        System.out.println("\n");
         Collections.sort(cars);
         for (int  d = 0; d < cars.size(); d++) {
            System.out.println(cars.get(d));
         }
        }


    }



