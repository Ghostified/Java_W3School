//program that creates a method which takes a lambda expression as a parameter


interface StringFunction {
    String run (String str);
}
public class LambdaExpression2 {
    public static void main(String[]Args) {
        StringFunction exclaim = (s) -> s + " ! ";
        StringFunction ask = (s) -> s + " ? " ;
        printFormatted("Hello ", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str,StringFunction formart) {
        String result = formart.run(str);
        System.out.println(result);
    }
}
