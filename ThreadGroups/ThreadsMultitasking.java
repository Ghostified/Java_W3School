//when performing a single task with multiple threads use one run () method

class ThreadsMultitasking extends Thread {
    public void run () {
        System.out.println("Task one");
    }
    public static void main (String[]Args) {
        ThreadsMultitasking t1 = new ThreadsMultitasking();
        ThreadsMultitasking t2 = new ThreadsMultitasking();
        ThreadsMultitasking t3 = new ThreadsMultitasking ();

        t1.start();
        t2.start();
        t3.start();
    }
}
