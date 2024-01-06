
//An iterator () object is used to loop through collection of ArrayList or Hashset

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorObject {
    
    public static void main(String [] Args) {
        
        //Create an ArrayList colection
        ArrayList <String>  cars = new ArrayList<String>();
        cars.add("Mazda");
        cars.add("Mitsubishi");
        cars.add("Peugot");
        cars.add("Porsche");
        cars.add("Tesla");

        //Get the iterator Object
        Iterator <String> it  = cars.iterator();

        //Print the first Item from collection
        System.out.println(it.next());

        //loop through a collection
        System.out.println("\n");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //use iterator to remove numbers < 10 in a collection
        System.out.println();
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(15);
    numbers.add(11);
    numbers.add(20);
    numbers.add(20);
    numbers.add(2);
    Iterator <Integer> num = numbers.iterator();
    while(num.hasNext()) {
        Integer integer = num.next();
        if (integer < 10) {
            num.remove();
        }
    }

    System.out.println(numbers); //prints out numbers less than 10 from the collection
    }


}
