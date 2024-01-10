/*
 * Dameon threads are background threads that are used to provide services to user thread tfor backgrounnd supporting tas
 * Automatically terminated at the end of the current threads and are  of low priority 
 *  methods : setDaemon(boolean) - used to mark the current threadas daemon thread or user thread
 * pblic boolean is Daemon() - used to check that current is daemon
 * 
 * if a thread is started and thereafter set as daemon, it throws an exception error
 */

public class DaemonThreads extends Thread{
 
    public void run () {

        //checking for daemon thread
        if (Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread working");
        }
        else {
            System.out.println("User thread at work");
        }
    }

    //main method
    public static void main (String[] Args) {
        DaemonThreads thread1 = new DaemonThreads();
        DaemonThreads thread2 = new DaemonThreads();
        DaemonThreads thread3 = new DaemonThreads();

        //set thread1 as Daemon
        thread1.setDaemon(true);

        //start threads 
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
