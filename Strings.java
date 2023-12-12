public class Strings {
    public static void main (String [] args){
        String text = "The quick brown fox";
        System.out.println("The length of the string is: " + text.length());

        //string to upper case 
        System.out.println(text.toUpperCase());

        //to lower case
        System.out.println(text.toLowerCase());

        //to find the index 
        System.out.println(text.indexOf("fox"));


        //Concatenation
        String x = "20";
        String y = "10";
        String z = x + y;
        System.out.println(z);

        String firstName = "Allan";
        String lastName = "Branson";

        System.out.println(firstName.concat(" " + lastName));

        System.out.println( firstName + " " + lastName);


    }
}
