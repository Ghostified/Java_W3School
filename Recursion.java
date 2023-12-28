public class Recursion {
    
    //Recursion is a technique of making a function call on itself

    public static void main(String[]Args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if ( k > 0) {
            return k + sum(k -1);
        } 
        else {
            return 0;
        }
    }
}
