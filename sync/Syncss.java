package sync;

class Counter {
    private int count;

    public synchronized void increment() {
        count += 1;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class Syncss {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    c.increment();
                    System.out.println("Thread 1 incremented count to: " + c.getCount());
                }
            }
        };

        Runnable obj2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    c.increment();
                    System.out.println("Thread 2 incremented count to: " + c.getCount());
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
