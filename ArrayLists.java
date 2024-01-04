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
    }
}
