import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.text.*;
import java.lang.Runnable;

class Tasks implements Runnable
{
    
    private String taskName;

    //constructor of the class Tasks
    public Tasks(String str) {

        //initializing the field taskName
        taskName = str;
    }

    //printing the task name then sleep for 1 sec
    //the complete proces is getting repeated five times 
    public void run () {
        try {
            for (int j = 0; j <= 5; j++) {
                if ( j == 0) {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh: mm: ss");

                    //print the initialization time for every task 
                    System.out.println("Initialization time for the task name: " + taskName + " = " + sdf.format(dt));
                }
                else {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh: mm: ss");

                    //print out the execution time for every task 
                    System.out.println("The time of execution for the task name:  " + taskName + " = " + sdf.format(dt));
                }

                //1000ms = 1 sec
                Thread.sleep(1000);
            }

            System.out.println( taskName + "  is complete");
        }

        catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
public class ThreadPoolExample {

    //maximum nmmber of threads in the thread pool
    static final int MAX_TH = 3;

    //Main Method
    public static void main (String[] Args) {
    
        //creating five new tasks
        Runnable rb1 = new Tasks("task 1");
        Runnable rb2 = new Tasks("task 2");
        Runnable rb3 = new Tasks("task 3");
        Runnable rb4 = new Tasks("task 4");
        Runnable rb5 = new Tasks("task 5");

        //creating a thread pool with MAX_TH  number of 
        //thread size the pool size is fixed
        ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

        //passes the Task Objects to the pool to execute 
        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5);

        //pool shutdown should be explicit otherwise it never ends 
        pl.shutdown();
    }
}

//Output
// Initialization time for the task name: task 3 = 03: 46: 52
// Initialization time for the task name: task 1 = 03: 46: 52
// Initialization time for the task name: task 2 = 03: 46: 52
// The time os execution for the task name:  task 3 = 03: 46: 53
// The time os execution for the task name:  task 2 = 03: 46: 53
// The time os execution for the task name:  task 1 = 03: 46: 53
// The time os execution for the task name:  task 3 = 03: 46: 54
// The time os execution for the task name:  task 2 = 03: 46: 54
// The time os execution for the task name:  task 1 = 03: 46: 54
// The time os execution for the task name:  task 3 = 03: 46: 55
// The time os execution for the task name:  task 2 = 03: 46: 55
// The time os execution for the task name:  task 1 = 03: 46: 55
// The time os execution for the task name:  task 3 = 03: 46: 56
// The time os execution for the task name:  task 1 = 03: 46: 56
// The time os execution for the task name:  task 2 = 03: 46: 56
// The time os execution for the task name:  task 3 = 03: 46: 57
// The time os execution for the task name:  task 1 = 03: 46: 57
// The time os execution for the task name:  task 2 = 03: 46: 57
// task 3  is complete
// Initialization time for the task name: task 4 = 03: 46: 58
// task 1  is complete
// Initialization time for the task name: task 5 = 03: 46: 58
// task 2  is complete
// The time os execution for the task name:  task 4 = 03: 46: 59
// The time os execution for the task name:  task 5 = 03: 46: 59
// The time os execution for the task name:  task 4 = 03: 47: 00
// The time os execution for the task name:  task 5 = 03: 47: 00
// The time os execution for the task name:  task 4 = 03: 47: 01
// The time os execution for the task name:  task 5 = 03: 47: 01
// The time os execution for the task name:  task 4 = 03: 47: 02
// The time os execution for the task name:  task 5 = 03: 47: 02
// The time os execution for the task name:  task 4 = 03: 47: 03
// The time os execution for the task name:  task 5 = 03: 47: 03
// task 4  is complete
// task 5  is complete