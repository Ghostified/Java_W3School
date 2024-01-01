import java.io.ObjectInputStream.GetField;

public class GetAndSet {
    //encapulation - hide sensitive data from users
    //declare variables as private
    //provide public get and set methods to  access and update PRIVATE  variables
    //the get method returns the value of a variable 
    //the set method sets the value of the variable

    private String name;

    public String getName () {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public class Main {
    public static void main (String [] Args) {
        GetAndSet myObj = new GetAndSet ();
        myObj.setName("Branson");
        System.out.println(myObj.getName());
    }
    }
}
