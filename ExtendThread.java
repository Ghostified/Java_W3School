// Threads can be created by extending by extending the thread class 
//if the class extends the thread , an instance of the class has to be created to be run by invoking the start() method

public class ExtendThread extends Thread {
    public static void main (String [] Args) {

        ExtendThread thread = new ExtendThread();
        thread.start();
        System.out.println("This code is outside the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
