
public class AccessMethods{

    public void fullThrottle(){ //methodOne
        System.out.println("The car is moving at maximum speed");
    }

    public void speed( int maxSpeed) { //method two
        System.out.println("The top speed is: " + maxSpeed);
    }

    public static void main (String [] Args) { //main method
        AccessMethods myCar = new AccessMethods(); //Create an Object = myCar

        myCar.fullThrottle(); //call the fullThrottle () Method
        myCar.speed(200 ); //Call the speed () method

    }
}
