import java.util.ArrayList;
public class ArrayListsIntegers {

    public static void main (String[]Args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        myNumbers.add(50);
        myNumbers.add(60);
        myNumbers.add(70);
        myNumbers.add(80);
        myNumbers.add(90);
        myNumbers.add(100);
        for(int i = 0; i < myNumbers.size(); i++) {
            System.out.println(myNumbers.get(i));
        }

    }
    
}
