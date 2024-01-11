package ThreadGroups;
//ThreadGroup provide a more convinient way to group threads into one single group in Java
//Thread Groups are organized in trees

/*
 * Constructors: 
 * ThreadGroup(String Name) - Creates a thread Group with a given name
 * ThreadGroup(ThredGroup parent, String Name) - Creates a thread group with a given parent group and name 
 * 
 * 
 */

public class ThreadGroup  implements Runnable{
    public ThreadGroup(String string) {
    }

    public void run () {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main (String[] Args) {
        ThreadGroup runnable = new ThreadGroup();
        ThreadGrp tg1 = new ThreadGrp("Parent ThreadGroup");

        Thread t1 = new Thread(tg1, runnable, "one");
        t1.start();
        Thread t2 = new Thread(tg1, runnable, "two");
        t2.start();
        Thread t3 = new Thread(tg1, runnable, "three");
        t3.start();

        System.out.println("Thread Group Name:"  + tg1.getName());
        tg1.list();

    }

    public String activeCount() {
        return null;
    }
}
