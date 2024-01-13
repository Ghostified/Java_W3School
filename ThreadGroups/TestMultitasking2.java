// program for performing a single task by multiple threads

class TestMultitasking2 implements Runnable {

    public void run () {
        System.out.println("Task one");
    }

    public static void main (String [] Args) {

        //passing annonymous object of TestMultitasking2 class
        Thread thread1 = new Thread(new TestMultitasking2());
        Thread thread2 = new Thread(new TestMultitasking2());

        thread1.start();
        thread2.start();
    }

}
