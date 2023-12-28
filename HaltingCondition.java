public class HaltingCondition {
    //Halt condition  in recursion, 
    //Halting condition in the example below is when end is not greator than the start

    public static void main (String [] Args) {
    int result = sum(5, 10);
    System.out.println(result);
    }
    public static int sum (int start, int end) {
        if (end > start) {
            return end + sum (start, end - 1);
        }else {
                    return end;
        }
  }

}

