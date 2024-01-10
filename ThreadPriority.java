//Each Thread has a priority in Java on a scale of 1-10
// getPriority () methods gets the priority of a thread
// setPriority () method updates or assigns the priority of the thread ,
//set prioririty () methods returns an IlegalArgument exception if the value of the priority is > 10
//Priority Constants 
//MIN_PRIORITY = 1
//MAX_PRIORITY = 10
//NORM_PRIORITY = Defaults

public class ThreadPriority  extends Thread{
    //method 1
    //when the start () is called, the run method () is invoked 

    public void run ()  {

        //print statement 
        System.out.println ("Inside the run method");
    }

    //main Method
    public static void main (String[] Args) {

        ////creating threads with ThreadPriority Class 
        //Default priority is 5
        ThreadPriority thread1 = new ThreadPriority();
        ThreadPriority thread2 = new ThreadPriority();
        ThreadPriority thread3 = new ThreadPriority();

    
        // displaying  priority of threads with getPriority() method
        System.out.println("Priority of this thread is " + thread1.getPriority());
        System.out.println("Priority of this thread is " + thread2.getPriority());
        System.out.println("Priority of this thread is " + thread3.getPriority());

        //Setting the threads priorities by passing int parameters
        thread1.setPriority (6);
        thread2.setPriority (3);
        thread3.setPriority (9);

        //displaying new thread priority
        System.out.println("Priority of this thread is " + thread1.getPriority());
        System.out.println("Priority of this thread is " + thread2.getPriority());
        System.out.println("Priority of this thread is " + thread3.getPriority());

        //Main Thread
        //Displaying the current thread currently being executed 
        System.out.println("Current thread being executed" + Thread.currentThread().getName());
        System.out.println("The priority of the main thread is " + Thread.currentThread().getPriority());

        //Set priority of the main thread to 10
        Thread.currentThread().setPriority(10);
        System.out.println("Priority of the main thread is " + Thread.currentThread().getPriority());

    }
    
}
