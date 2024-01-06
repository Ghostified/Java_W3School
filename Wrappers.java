//Wrapper classes = use primitive data types as objects when working with collections e.g ArrayList
// byte = Byte
//int = Integer
//float = Float
//char = Character
//boolean = Boolean

public class Wrappers {
    //creating a wrapper class 
    public static void main (String [] Args) {
        Integer myInt = 5353636;
        Float myFloat = (float) 9.56;
        Double myDouble = 7.890;
        Character myCharacter = 'B';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myCharacter);

        // get values with associated wrappers  e.g .charValue(), .intValue()..
        System.out.println("\n");
        System.out.println(myCharacter.charValue());
        System.out.println(myInt.intValue());
        System.out.println(myDouble.floatValue());
        System.out.println(myDouble.doubleValue());

        //toString() is used convert integers to Strings  & the lenghth method outputs the length of the String

         System.out.println("\n");
         String myString = myInt.toString();
         System.out.println(myString.length());

    }
}
