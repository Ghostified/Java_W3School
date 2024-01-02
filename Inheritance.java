public class Inheritance {
    //Subclass (child) - the class that inherits from another class
    //superclass (parent) - the class being inherited from
    //use the extend keyword to inherit from a class

    static class Vehicle {
        protected String brand = "Ford"; //vehicle attribute
        public void honk(){ //vehicle method
            System.out.println("Tuut, Tuut");
        }
    }

    static class Car extends Vehicle {
        private String modelName  = "Mustang"; //car attribute
    }
     public static void main (String [] Args) {

            //create a myCar Object 
            Car myCar =  new Car();

            //call the honk() method (from the vehicle class) on the myCar Object
            myCar.honk();

            //dispaly the value of the brand attribute (from the vehicle class ) abd the value of the modelName fromm the Car Class
            System.out.println(myCar.brand + " " + myCar.modelName );
        }
}
