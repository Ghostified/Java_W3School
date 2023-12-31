public class FinalAttributes {
    //using the final keyword, attributes and methods can not be overridden/modified
     final int x = 10;;
     final double PI = 3.142;

     public static void main (String [] Args) {
        FinalAttributes myObject = new FinalAttributes();
        myObject.x = 50; //generates error , The final field FinalAttributes.x cannot be assigned
        myObject.PI = 25; //generates erroe
        System.out.println(myObject.x);
     }
}
