public class CreateThread extends Thread{
    public void run () {
        System.out.println("Thread is running ...");
    }

    public static void main (String [] Args) {
        CreateThread t1 = new CreateThread();
        t1.start();
    }
}
