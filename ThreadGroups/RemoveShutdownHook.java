//The removeShutdownHook () method is used to remove a registered shutdown hook on a thread

public class RemoveShutdownHook {
    

    //this Msg class is derived from the thread class
    static class Msg extends Thread {
        public void run () {
             System.out.println("Bye.. ");
        }
    }

    public static void main (String [] Args) {
        try {

            //creating an object of the class Msg
            Msg ms = new Msg();

            //registering the Msg object to a shutdown Hook
            Runtime.getRuntime().addShutdownHook(ms);

            //printing the current state of the program
            System.out.println("The program is beginning");

            //causing the thread to sleep for  9 seconds
            System.out.println("Waiting for 9 seconds...");
            Thread.sleep(9000);

            //printing the messsage program is terminating
            System.out.println("The program is terminating...");
        }
         catch (Exception ex) {
            ex.printStackTrace();
         }

    }

}


