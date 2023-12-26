public class Loops {
    //example of a while loop
    //Syntax = while (condition) {}

    public static void main(String []Args) {

        //While Loop 
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("\n");

        //Do/While Loop
        /*
         * Executes the code block once , before checking if the condition is true.
         * It repeat the loop as long as the condition is true
         */

         int b = 1;
         do {
            System.out.println("b");
            b++;
         }
         while (b <  5);

         /*
          * For loops
          * for (statement 1, statement 2, statement 3)
          /* statement one - executed one time before the execution of the code block
          *statement 2 - defines the conditions for executing the code block
          *statement 3 : is executed every time after the code block has been executed 
          */

          System.out.println("\n");

          //int c;
          for (char c = 0; c < 6; c++){
            System.out.println(c);
          }

          System.out.println("\n");
          for (int d = 0; d <= 10; d = d + 1){
            System.out.println(d);
            d++;
          }

          //Nested Loops Example
          System.out.println("\n");

          //outer loop 
          for (int e = 0; e <= 3; e++) {
            System.out.print("\n");
            System.out.println("Outer loop :  " + e);

            for (int f = 0; f <=2; f++) {
                System.out.print("\n");
                System.out.println("Inner Loop " + f);
            }
          }

          //For each loop
          //This is exclusively used to loop through  an array
          //for (Variable name: array name ) { //Program}

          System.out.println("\n");
          String [] cars = {"Volvo", "Mercedes", "Mazda", "Subaru","Alfa Romeo"};
          for (String g : cars){
            System.out.println(g);
          }

          //Break keyword in loops
          //Can be used to jump out of a switch statement or a loop
          //Example: Breaks at 3, outputs h<3

          System.out.println("\n");
          for (int h = 0 ; h < 10; h++){
            if ( h == 3){
                break;
            }
            System.out.println(h);
          }

          //continue statement
          //it breaks one iteration in the loop , if a specified condition occurs ,
          //The continues with the next iteration in the loop
          //Example: skips the value of 4,5 & 6

          System.out.println("\n");

          for (int j = 1; j < 10; j++) {
            if (j == 4 || j == 5 || j ==6 ){
                continue;
            }
            System.out.println(j);
          }

          //Break and Continue in while loops

          System.out.println("\n");
          int k = 0;
          while (k < 10) {
            System.out.println(k);
            k++;
            if (k == 5 ){
                break;
            }
          }

          int l = 0;
          while(l < 10) {
            if (l == 5) {
                l++;
                continue;
            }
            System.out.println(k);
            l++;
          }

    }
}
