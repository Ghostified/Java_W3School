//Thread Pools  represent a group of worker threads waiting for the job and reuses many times
//a group of fixed size thread is created 
/*
 * Methods:
 * newFixedThreadPool(int s) creates a new thread pool of fixed size s
 * newCachedThreadPool() creates a new thread pool that creates the new threads when needed but will still use previously created threads when available to use
 * newSingleThreadExecutor() - thios method creats a new thread
 * 
 */
package ThreadPools;
 import java.util.*;
 import java.util.concurrent.Executors;
 import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {  
     public static void main(String[] args) {  
        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new WorkerThread("" + i);  
            executor.execute(worker);//calling execute method of ExecutorService  
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    }  
 }  

 