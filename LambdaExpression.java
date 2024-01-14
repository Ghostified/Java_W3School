//lambda expressions take in paramenters and return a value
//parameter -> expression


import java.util.ArrayList;
import java.util.function.Consumer;
public class LambdaExpression {
    public static void main (String[] Args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(10);
        numbers.add(20);
        numbers.forEach( (n)-> {System.out.println(n);});

        //using java consumer interface to store a lambda expression in a variable
        //
        Consumer<Integer> method = (m) -> {System.out.println(m);};
        numbers.forEach(method);
    }
}