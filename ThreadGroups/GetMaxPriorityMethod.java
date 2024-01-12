package ThreadGroups;
//this method returns the maximum priority of the thread Group



public class GetMaxPriorityMethod {
    public static void main (String [] Args) throws SecurityException,InterruptedException{
        
        //creating the thread group
        ThreadGroup tg = new ThreadGroup("The parent Group ");

        ThreadGroup tg1 = new ThreadGroup(tg, "The child group");

        ThreadNew th1 = new ThreadNew("The first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("The second ", tg);
        System.out.println ("Starting the second");


        int priority = tg.getMaxPriority();
        System.out.println("The maximum priority of the parent threadGroup" + priority);

    }
}

class ThreadNew extends Thread {
    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }

    public void run() {
        for(int j =0; j < 100; j++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("The exception has been encountered " + e);
            }
        } System.out.println(Thread.currentThread().getName() + " thread has finished execution");
    }
}

