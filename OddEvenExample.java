//theis program prints out odd and even numbers in TWO threads 
//the time complexity is O(N) 
//the notify() method in a synchronized block

public class OddEvenExample {

    //starting the counter 
    int counter = 1;
    static int NUM;
    
    //method for printing out the odd numbers
    public void displayOddNumber () {

        synchronized(this) {

            //synchronized block
            //synchronizing the numbers till NUM
            while (counter < NUM) {

                //if counter is ebven then display
                while (counter % 2 == 0) {

                    //exceptio handler 
                    try {
                        wait ();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }

                //print the number
                System.out.println(counter + " ");

                //increment the counter 
                counter = counter + 1;

                //notifying the thread waiting for this loc 
                notify ();
            }
        }
    }

    //method for printing the even numbers
    public void displayEvenNumber () {
        synchronized (this) {

            //printing the number till NUM
            while( counter < NUM ) {

                //if counr is odd then display
                while (counter % 2 == 1) {

                    //handling the exception
                    try {
                        wait ();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }

                //printing the number 
                System.out. println (counter + "  ");

                //incrementing the counter 
                counter = counter + 1;

                //notifying the second thread
                notify();
            }
        }
    }
    
    //main method
    public static void main (String[] Args) {

        //num is given 
        NUM = 20;

        //creating an object of the class oddEvenExample
        OddEvenExample oddEvenObject = new OddEvenExample();

        //Creating a thread thread1
        Thread thread1 = new Thread( new Runnable() {
            public void run () {

                //invoking the the method displayEvenNumber() using thread1
                oddEvenObject.displayEvenNumber();
            }
        });

        //Creating  a thread2
        Thread thread2 = new Thread(new Runnable(){
            public void run () {

                //invoking the method displayOddNumber using thread2
                oddEvenObject.displayOddNumber();
            }
        });

        //starting both threads
        thread1.start();
        thread2.start();
    }
}
