//when performing multiple tasks in multiple threads create multiple run() methods for each task
class Simple1 extends Thread {
    public void run () {
        System.out.println("Task one");
    }
}

class Simple2 extends Thread {
    public void run () {
        System.out.println ("Task Two");
    }
}
public class TestMultitasking {
    public static void main (String [] Args) {
        Simple1 task1 = new Simple1();
        Simple2 task2 = new Simple2();

        task1.start();
        task2.start();
    }
}

