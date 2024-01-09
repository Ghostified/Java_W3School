public class ThreadTwice extends Thread {
    //Once a thread is running, the start() method can not be invoked twice. 

    public void run () {
        System.out.println("Running....");
    }
    public static void main (String [] Args) {
        ThreadTwice obj = new ThreadTwice();
        obj.start();
        obj.start(); //throws an exception error 
    }
}
