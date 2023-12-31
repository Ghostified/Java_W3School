public class Cons {
  //Construcots  - special methods used to initialize objects
  int x; //create a class attributa

  //create a constructor class
  public Cons() {
    //set the initial value for the class attribute x
    x = 5; 
  }

  public static void main (String [] Args) {
    //Create  an object of the class Cons (This will call the constructor)
    Cons myObj = new Cons();
    System.out.println(myObj.x);
  }
}
