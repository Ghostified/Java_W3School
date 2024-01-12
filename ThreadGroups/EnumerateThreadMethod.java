//	This method copies into the specified array every active thread in the thread group and its subgroups

import java.util.concurrent.ThreadLocalRandom;

public class EnumerateThreadMethod  {
    
    public static void main (String[] Args) throws InterruptedException,SecurityException {

        //creating the thread Group
        ThreadGroup tg = new ThreadGroup("The parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, "The child group");

        ThreadNew th1 = new ThreadNew("The first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("The second", tg);
        System.out.println("Starting the second");

        //Returning the number of threads kept in the array
        Thread[] grp = new Thread[tg.activeCount()];
        int cnt = tg.enumerate(grp);
        for (int j =0; j< cnt; j++) {
            System.out.println("Thread: " + grp[j].getName() + " is found");
        }
    }
}

class ThreadNew extends Thread {
    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }

    //overriding the run() method
    public void run() {
        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(5);
            } 
            catch (InterruptedException e) {
                System.out.println("The exception has been encountered" + e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " thread has finished executing");
    }
 }
