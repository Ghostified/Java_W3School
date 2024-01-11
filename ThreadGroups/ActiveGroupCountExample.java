/*
 * activeGroupCount () method - This is used to return an estimate of the number of active groups in the thread group and its sub groups
 */
import java.lang.*;
import java.rmi.server.ExportException;

public class ActiveGroupCountExample {
    public static void main (String [] Args) {
        
        //creating the thread group 
        ThreadGroup tg = new ThreadGroup("The parent group of threads");

        ThreadGroup tg1 = new ThreadGroup(tg, "The child group");

        ThreadNew th1 = new ThreadNew("The first " , tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("The second " , tg);
        System.out.println("Starting the second");

        //Checking the number of active threads by invoking the  activeGroupCount() method
        System.out.println("The total number of active thread grouops are "  + tg.activeGroupCount());

    }
}
class ThreadNew extends Thread {
    ThreadNew (String tName , ThreadGroup tgrp) {
        super(tgrp , tName);
        start();
    }

    public void run () {
        for ( int j = 0; j < 100; j++){
            try {
                Thread.sleep(20);
            }
            catch (InterruptedException e) {
                System.out.println("The exception has been encountered" + e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " Thread has finished executing");
    }
}
