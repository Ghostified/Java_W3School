public class Objects {
    //Objects are an instace of a class.
    //syntax: Class name, object name , new ()

    int x = 5;
    public static void main (String[] args) {
        Objects myObj = new Objects(); //Creating an object one for the class Objects
        System.out.println(myObj.x);
        System.out.println("\n");

        //Creating multiple objects
        Objects harry = new Objects();
        Objects weasly = new Objects();
        System.out.println(harry.x * weasly.x);//outputs 25
    }
}
