import java.util.*;
//Hashmaps store data in key value pairs
//one object as a key (index) while the other as an object(value) 
//example: String keys with integer values ,String keys  and string values and Integer keys and Integers values

public class HashMaps {
    public static void main (String [] Args) {

        //create a hashmap of string keys and string objects
        HashMap<String , String> cities = new HashMap<String, String>(); 

        //Add items to a hashmap using the put() method
        cities.put("Kenya", "Nairobi");
        cities.put("Tz", "Dar Es Salam");
        cities.put("Uganda", "Kampala");
        cities.put("Sudan","Khartoum");
        cities.put("Burundi","Bujumbura");

        //Print out the hashmap
        System.out.println(cities);

        //Access an object in the hashMap iusing the get () method
        System.out.println("\n");
        System.out.println(cities.get("Kenya"));
        System.out.println(cities.get("Uganda"));
        System.out.println(cities.get("Tz"));
        System.out.println(cities.get("Burundi"));
        System.out.println(cities.get("Sudan"));

        //Check the size of the hashmap using the size method
        System.out.println("\n");
        System.out.println(cities.size());

        //Loop through an Hashmap using the keySet() method to print keys
        System.out.println("\n");
         for (String i : cities.keySet()){
           // System.out.println("Looping ");
            System.out.println(i);
         }

         //use a for -each loop to iterate through the value set using the values() method
         System.out.println("\n");
          for (String z : cities.values()){
            //System.out.println("The values in the hashmap");
            System.out.println(z);
          }

          HashMap <String, Double> formulae = new HashMap<String, Double>();
          formulae.put("Pie", 3.142);
          formulae.put("Gravity", 9.80);
          formulae.put("Eulars Constant e", 2.718 );

          //Loop through the hashmap and print out the values
          System.out.println("\n");
          for(String f : formulae.keySet()){
            System.out.println("key: " + f + " Values: " + formulae.get(f));
          }
          
    }
    
}
