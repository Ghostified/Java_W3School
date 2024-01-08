//Multithreading -  Process in java used to execute multiple threads to acieve multi tasking
//Threads use a shared memory and context switchingtakes less time
//Thread Staes
//New - When a thread is created its on the new state
//Active - When the thread invokes the start () method it is either running or runnable
//Runnable - Waiting on queue 
//Running - actively on the cpu 
//Blocked or Waiting - inactive for a span of time i.e idle
//Timed waiting - when sleep() is invoked for the thread to pause based on a timeline
//Termination - Due to error or finished  a job

//Implementation of thread states
//public static final Thread.State NEW - First State which is new 
//public static final Thread.State RUNNABLE -  waiting on queue
//public static final Thread.State BLOCKED - Blocked state awaiting a Lock
//public static final Thread.State WAITING - waiting for another thread to complete its task. Waiting is invoked by the Thread.join () & Object.wait () methods
//public static final Thread.State TIMED_WAITING - In a timed waiting with a time constraint using e.g sleep ()
//public static final Thread.State TERMINATED - Dead, has completed execution

//program demo for thread states

// import java.lang.Thread.*;
// public class ThreadState {
//     class ABC implements Runnable {
//         public void run() {
            
//             //try catch block
//             try {
//                 Thread.sleep(100); //moving thread t2 to the state timed waiting
//             }
//             catch (InterruptedException ie) {
//                 ie.printStackTrace();
//             }

//             System.out.println("The state of the thread t1 invoked the method join () on thread t2 -" + ThreadState.t1.getState());

//             try {
//                 Thread.sleep(200);
//             }
//             catch (InterruptedException ie){
//                 ie.printStackTrace();
//             }
//         }
//     }

//     //Threadstate class implements the interface runnable
//     public class ThreadState implements Runnable 
//     {
//         public static Thread t1;
//         public static ThreadState obj;

//         //main  method
//         public static void main (String [] Args) {
            
//             //craeting an object of the class Threadstate
//             obj = new ThreadState();
//             t1 = new Thread(obj);

//             //thread t1 is is spawned
//             //Thread t1 is currently in the NEW state
//             System.out.println("The state of thread t1 after spawning it - " + t1.getState());

//             //invoking the start() method
//             //the thread t1
//             t1.start();

//             //thread t1 is moved to the runnable state 
//             System.out.println("The state of thread t1 after invoking the method start () on it " + t1.getState());
//         }

//         public void run () {
//             ABC myObj = new ABC();
//             Thread t2 = new Thread(myObj);

//             //Thread t2 is created and is currently in the NEW state
//             System.out.println("The state of thread of thread t2 after spawning it -  " + t2.getState());

//             //thread t2 is moved to the runnable state
//             System.out.println("The state of thread t2 after calling the method start() on it - " + t2.getState());

//             //try catch block for smooth operation
//             try {

//                 //moving thread t1 the state timed waiting
//                 Thread.sleep(200);
//             }
//             catch (InterruptedException ie) {
//                 ie.printStackTrace();
//             }

//             System.out.println("The state of the thread t2 invoking the method sleep() on it - " + t2.getState());

//             //try-catch block for smooth flow of the program

//             try {

//                 //waiting for thread t2 to complete execution
//                 t2.join();
//             }
//              catch (InterruptedException ie) {
//                 ie.printStackTrace();
//              }
//              System.out.println("The state of thread t2 when it has completed execution- " + t2.getState());
//         }
//     }
// }

import java.lang.Thread.*;

// Inner class implementing the Runnable interface
class ABC implements Runnable {
    public void run() {
        // Try-catch block for handling InterruptedException
        try {
            // Moving thread t2 to the state TIMED_WAITING
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        // Output the state of thread t1 invoking the method join() on thread t2
        System.out.println("The state of the thread t1 invoked the method join() on thread t2 - " + ThreadState.t1.getState());

        try {
            // Another sleep to demonstrate the thread state transitions
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

// Main class implementing the Runnable interface
public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState obj;

    // Main method
    public static void main(String[] Args) {
        // Creating an object of the class ThreadState
        obj = new ThreadState();
        t1 = new Thread(obj);

        // Output the state of thread t1 after spawning it - NEW
        System.out.println("The state of thread t1 after spawning it - " + t1.getState());

        // Invoking the start() method on thread t1
        t1.start();

        // Output the state of thread t1 after invoking the method start() on it - RUNNABLE
        System.out.println("The state of thread t1 after invoking the method start() on it - " + t1.getState());
    }

    // Run method for thread t1
    public void run() {
        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj);

        // Output the state of thread t2 after spawning it - NEW
        System.out.println("The state of thread t2 after spawning it - " + t2.getState());

        // Output the state of thread t2 after calling the method start() on it - RUNNABLE
        System.out.println("The state of thread t2 after calling the method start() on it - " + t2.getState());

        // Try-catch block for smooth operation
        try {
            // Moving thread t1 to the state TIMED_WAITING
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        // Output the state of thread t2 invoking the method sleep() on it - TIMED_WAITING
        System.out.println("The state of the thread t2 invoking the method sleep() on it - " + t2.getState());

        // Try-catch block for smooth flow of the program
        try {
            // Waiting for thread t2 to complete execution
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        // Output the state of thread t2 when it has completed execution - TERMINATED
        System.out.println("The state of thread t2 when it has completed execution - " + t2.getState());
    }
}

