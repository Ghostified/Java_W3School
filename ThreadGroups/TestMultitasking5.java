//program for running multiple tasks in multiple threads by anonymous class that implements runnable interface

public class TestMultitasking5 {
    public static void main (String [] Args) {
        Runnable r1 = new Runnable() {
            public void run () {
                System.out.println("task one");
            }
        };

        Runnable r2 = new Runnable() {
            public void run () {
                System.out.println("Task two");
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
