//.isAlive() m,ethod is used in multithreading to prevent concurrency

public class Concurrency  extends Thread{ 
    public static int amount = 0;

    public static void main (String [] Args) {
        Concurrency thread = new Concurrency();
        thread.start();

        //wait for the thread to finish
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        //Update amount and print its value
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    } 
    public void run() {
        amount++;
    }
}
