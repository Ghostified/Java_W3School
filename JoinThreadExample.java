
//The ThreadJoin class is a child of the class Thread

class ThreadJoin extends Thread {

    public void run()
    {
        for(int j = 0; j < 2; j++) {
            try {
                Thread.sleep(900);
                System.out.println("The Current Thread Name is : " + Thread.currentThread().getName());
            }
            catch (Exception e){
                System.out.println("The exception has been caught: " + e);
            }

            System.out.println(j);
        }
    }
}
public class JoinThreadExample extends Thread{
    //understanding joining in threads
    //main method 

    public static void main (String [] Args) {


        //Creating three new threads
        JoinThreadExample thread1 = new JoinThreadExample();
        JoinThreadExample thread2 = new JoinThreadExample();
        JoinThreadExample thread3 = new JoinThreadExample();

        //Start thread1
        thread1.start();

        //starting the second thread when the second thread has ended or died 
        // while(thread1.isAlive()) {
        //     System.out.println ("Curent thread is still running" + Thread.currentThread().getName());
        // }
         try {
             System.out.println("The current thread name is :  " + Thread.currentThread().getName());

            //Invoking the join method 
            thread1.join();
        }

        //catch block for catching raised exception 

        catch(Exception e) {
            System.out.println("The exception has been caught " + e);
        }

        //thread2 starts
        thread2.start();

        //starting thread3 after thread2 has ended or died 
        //while(thread2.isAlive()) {
          //  System.out.println(" The current running thread is " + Thread.currentThread().getName());
        //}

        try {
            System.out.println("The current thread name is " + Thread.currentThread().getName());
            thread2.join();
        }

        //catch block for the raised exception 
        catch (Exception e) {
            System.out.println ("The exception has been caught: " + e );
        }

        //thread3 starts
        thread3.start();
        //while (thread3.isAlive()) {
          //  System.out.println ("The current running thread is : " + Thread.currentThread().getName());
        //}
        
    }

}
