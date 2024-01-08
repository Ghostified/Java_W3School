// a thread can be created by implementing the runnable interface
//If thread is created by implementing runnable interface , the thread can be run by passing an instace of the class to a Thread Objects constructor then calling the threads start() method

public class RunnableInterfaceThread implements Runnable {
    public static void main (String [] Args) {
        RunnableInterfaceThread object = new RunnableInterfaceThread();
        Thread thread = new Thread(object);
        thread.start();
        System.out.println("This code is outside the thread");
    }
    public void run() {
        System.out.println("This code is within a thread");
    }
}
