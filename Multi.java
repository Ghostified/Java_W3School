//The runnable interface should be implemented by any class whose instances are to be executed by a thread
//public void run () - used to perform action on a thread

//starting a thread
//the start () method is used to start a newly created thread. it performs the following tasks:
/*
 * A new thread starts
 * A thread moves from New state to Runnable state
 * When the thread gets a chance to execute , its tartget run() method will execute
 */

public class Multi implements Runnable{
   public void run() {
    System.out.println("Thread is running..");
   } 

   public static void main (String [] Args) {
    Multi m1 = new Multi();
    Thread t1 = new Thread (m1);
    t1.start();
   }
}
