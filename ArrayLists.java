import java.util.ArrayList;
import java.util.*;

//ArrayList -  More flexible than arrays as elements can be added or removed in an Array
//Creating an arrayList
public class ArrayLists{
    public static void main (String [] Args) {
        ArrayList<String> cars = new ArrayList<String> () ;
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //Access an item in an array list 
        cars.get(0);

        //Modify an item in arrayList
        cars.set(1,"Tesla");
        System.out.println(cars);

        //Remove item in an array list
        cars.remove(3);
        System.out.println(cars);

        //Check how many items are in an arrayLit
        System.out.println(cars.size());
        
    }
}
