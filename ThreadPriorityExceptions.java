//the setPriority ( ) method has a max parameter of 10
//If priority is > 10 , java.lang throwsa an IllegalArgumentException

public class ThreadPriorityExceptions extends Thread{
  
    public static void main (String[]Args) {

        //set an illegal priority of 17 which is > 10
        Thread.currentThread().setPriority(17);

        //retrive the current thread with currentThread() method
        //Display the priority of the main thread

        System.out.println ("The priority of the current thread id " + Thread.currentThread().getPriority());

        //output
        //Exception in thread "main" java.lang.IllegalArgumentException
        //at java.base/java.lang.Thread.setPriority(Thread.java:1138)
        //at ThreadPriorityExceptions.main(ThreadPriorityExceptions.java:9)
    }
}
