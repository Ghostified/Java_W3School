//runtime class - allows interaction with the runtime environment

public class RuntimeClass {
    public static void main (String[]Args) throws Exception{

        //open a new notepad
       // Runtime.getRuntime().exec("notepad");

        //shutdown a system
        //Runtime.getRuntime().exec("shutdown -r -t -o");

        //check available processors
        System.out.println(Runtime.getRuntime().availableProcessors());

        //freeMemory() and totalMemory () methods in the Runtime class
        Runtime r = Runtime.getRuntime();
        System.out.println("Total memory : " +r.totalMemory());
        System.out.println("Free Memory: " + r.freeMemory());

        //creating 1000 instances free memory will be less
        for (int i = 0; i < 1000; i++) {
            new RuntimeClass();
        }

        //printing out available memory 
        System.out.println("After creating 1000 instaces , new memory free is:  " + r.freeMemory());
        
        //collecting garbage
        System.gc();

        //New memory available after garbage collection
        System.out.println("After gc(), Free memory is: " + r.freeMemory());

    }
}
