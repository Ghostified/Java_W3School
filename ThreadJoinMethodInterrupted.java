// when the join ( ) method is interupted, an InturreptedException occurs as below:

class ABC extends Thread {
    Thread threadToInterrupt;

    public ABC(Thread threadToInterrupt) {
        this.threadToInterrupt = threadToInterrupt;
    }

    //overriding the run method
    public void run() {

        //invoking the interupt() method
        threadToInterrupt.interrupt();
    }
}

public class ThreadJoinMethodInterrupted {
    
    //main method
    public static void main (String[] Args) {
        try {

            //creating an object of class ABC
            ABC thread1 = new ABC(Thread.currentThread());
            
            //thread1.threadToInterrupt = Thread.currentThread();
            thread1.start();

            //invoking the join() method throws an exception error
            thread1.join(); 
        }
        catch (InterruptedException ex)  {
            System.out.println("The exception has been caught " + ex);
        }
    }
}
