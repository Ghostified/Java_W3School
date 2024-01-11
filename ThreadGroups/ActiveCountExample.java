package ThreadGroups;
//code that illustrates the activeCount() method

class ThreadNew extends Thread {
    //constructor of the class
    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }
    public void run() {
        for (int j = 0; j < 1000; j++) {
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                System.out.println("The exception has been encounterred" + e);
            }
        }
    }

}

public class ActiveCountExample {

    //main method
    public static void  main (String [] args) {


        //creating the thread group
        ThreadGroup tg = new ThreadGroup("The parent group of Thraeds");

        ThreadNew th1 = new ThreadNew("first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("second", tg);
        System.out.println("Starting the second");

        //Checking the number of active thread by invoking the activecount() method
        System.out.println("The total number of active threads" +  tg.activeCount());

    }

}
