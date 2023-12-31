public class Const{
int modelYear;
String modelName;

public Const (int year, String name){
    modelName = name;
    modelYear = year;
}
public static void main (String[] Args) {
    Const myCar = new Const( 2015, "Larmboghini");
    System.out.println(myCar.modelName + " " + myCar.modelYear);
}
}