//The destroy() method is  a thread pool method used to destroy a thread group and all its sub - groups

public class DestroyMethod {
    public static void main (String [] Args)  throws SecurityException,InterruptedException{
        ThreadGroup tg = new ThreadGroup("The parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "The child Group");

        ThreadNew th1 = new ThreadNew("The first", tg1);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("The second", tg1);
        System.out.println("Starting the second");

        //waiting for the other threads to be finished
        th1.join();
        th2.join();

        //destroying the child thread group
        tg1.destroy();
        System.out.println(tg1.getName() + "is destroyed");

        //destroying the parent thread
        tg.destroy();
        System.out.println(tg.getName() + "is destroyed ");
    }
}

class ThreadNew extends Thread {
    // construcor of the class
    ThreadNew(String tName, ThreadGroup tgrp) {
        super (tgrp, tName);
        start();
    }

    //overiding the run () method 
    public void run () {
        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println("The exception has been encounterred" +e);
            }
        }
        System.out.println(Thread.currentThread().getName() + "Thread has finished executing");
    }
}
