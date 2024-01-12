package ThreadGroups;
//Code illustrating the getParent() method in threads
//the getParent() method is used for getting the parent of a child in a thread group

public class GetParentMethod {

    public static void main (String[] Args) throws InterruptedException, SecurityException {

        //creating the threadGroup
        ThreadGroup tg = new ThreadGroup("The parent Group");

        ThreadGroup tg1 = new ThreadGroup(tg , "The child Group");

        ThreadNew th1 = new ThreadNew("The first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("The second", tg);
        System.out.println ("Starting the second");


        //Printing the parent Group of both parent and child groups
        System.out.println("The parent threadGroup for " + tg.getName() + " is " + tg.getParent().getName());
        System.out.println("The ParentThreadGroup for " +tg1.getName() + " is " + tg1.getParent().getName());

    }
}


class ThreadNew extends Thread {
    //constructor of the class
    ThreadNew (String tName, ThreadGroup tgrp) {
        super (tgrp, tName);
        start();
    }

    //overiding the run() method
    public void run () {
        for (int j = 0; j < 100; j++) {
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                System.out.println("The exception has been encountered" + e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " thread has completed execution");
    }
}