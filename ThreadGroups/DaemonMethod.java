// isDaemon() method isused to test if a thread group is a Daemon thread group
//it returns a boolean



public class DaemonMethod {

    public static void main (String [] Args) throws InterruptedException, SecurityException {

        //creating thread Group
        ThreadGroup tg = new ThreadGroup("The parent group");

        ThreadGroup tg1 = new ThreadGroup("The Child Group");


        ThreadNew th1 = new ThreadNew("The first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("The second", tg);
        System.out.println("Starting the second");

        if (tg.isDaemon() == true) {
            System.out.println("The group is a daemon group");
        }
        else {
            System.out.println("The group is NOT a daemon group");
        }
    }

}

class ThreadNew extends Thread{

    //class constructor
    ThreadNew (String tName, Thread tgrp) {
        super(tgrp, tName);
        start();
    }

    public ThreadNew(String string) {
    }

    public ThreadNew(String tName, ThreadGroup tg) {
    }

    //overiding the run() ,method
    public void run() {
        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                System.out.println("The exception has been encountered" + e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " thread has finished execution");
    }
}
