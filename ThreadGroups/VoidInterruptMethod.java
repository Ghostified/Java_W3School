//the voidInterrrupt () method is used to interrupt all threads in a threadGroup



public class VoidInterruptMethod {
    
    public static void main (String [] Args) throws InterruptedException, SecurityException {

        //Creating the thread Group 
        ThreadGroup tg = new ThreadGroup("The parent Group");

        ThreadGroup tg1 = new ThreadGroup(tg, "Ths child Group");

        ThreadNew th1 = new ThreadNew("The first", tg);
        System.out.println("Starting The first");

        ThreadNew th2 = new ThreadNew("The second", tg);
        System.out.println("Starting the second");

        //invoking the interrupt method 
        tg.interrupt();
    }
}

class ThreadNew extends Thread {
    //constructor of the class
    ThreadNew (String tName , ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }

    //overriding the run() method 
    public void run() {
        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(5);
            }
            catch(InterruptedException e ) {
                System.out.println ("The Exception has been encountered " + e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " thread has finished execution");
    }
}
