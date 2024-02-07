// A thread is the smallest unit that we can work with
/* Scheduler concept is responsible to allow threads to execute */

/**
class C implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HI in C");
        }
    }
}
 */

class Counter {
    int count = 0; // synchronized is a keyword that allows only one thread to use the method. Preventing data loss
    public synchronized void increment() {
        count++;
    }
}

public class Threads {
    public static void main(String [] a) throws InterruptedException {

        Counter count = new Counter();

        Runnable obj = () -> {
            for(int i = 0; i <= 10000; i++) {
                count.increment();
            }
        };

        Runnable obj2 = () -> {
                for(int i = 0; i <= 10000; i++) {
                    count.increment();
                }
            };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);


        // Setting priority is a suggestion to scheduler only not a demand
        // MAX_PRIORITY: 10
        // t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

        // Pauses main until thread is done.
        t1.join();
        t2.join();

    }
}
