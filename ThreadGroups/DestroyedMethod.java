// isDestroyed method in thread groups is used to check if a thread group has been destroyed 

public class DestroyedMethod {

    public static void main (String [] Args) throws InterruptedException, SecurityException {

        //creating ThreadGroup
        ThreadGroup tg = new ThreadGroup(" The parent group");

        ThreadGroup tg1 = new ThreadGroup(tg, " The child Group");

        ThreadNew th1 = new ThreadNew("The first ", tg);
        System.out.println ("Startting the first");

        ThreadNew th2 = new ThreadNew("The second" , tg);
        System.out.println ("Starting the second");

        if (tg.isDestroyed() == true) {
            System.out.println ("The group has been destroyed");
        } else {
            System.out.println ("The group has NOT been destroyed");
        }
    }
}
    

class ThreadNew extends Thread {
    ThreadNew(String tName, Thread tgrp) {

        super(tgrp, tName);
        start();
    }

    public ThreadNew(String tName, ThreadGroup tg) {
    }

    //overriding the run method 
    public void run () {
        for ( int j = 0; j < 100; j++) {
            try{
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                System.out.println("The exception has  been encountered" + e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " thread has finished execution");
    }
}