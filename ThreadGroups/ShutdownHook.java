//Shutdown hook is used to perform clean up resources or save state when JVM shuts down
//The addShutdownHook () method is used register a thread with the virtual machinne (jvm)
//The remove ShutdownHook () method is used to remove an already registered shutdown hook

public class ShutdownHook {

    //factory method = the method that returns an instance of a class is known as factory method
    public static void main (String [] Args) throws Exception {

        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new MyThread());

        System.out.println("Now main sleeping .. press ctrl + c to exit");
        try {
            Thread.sleep(3000);
        }
        catch (Exception e) {
            System.out.println("The exception has been encountered");
        }
    }

}

class MyThread extends Thread {
    public void run () {
        System.out.println("Shutdown hook class task completed");
    }
}
