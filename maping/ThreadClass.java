package maping;

class ThreadClass extends Thread {
    private int count;
    private String name;

    // Constructor to initialize count and name
    public ThreadClass(int count, String name) {
        this.count = count;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(name + " thread: " + i);
            try {
                Thread.sleep(500); // Sleeping for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(name + " thread interrupted.");
            }
        }
        System.out.println(name + " thread completed.");
    }
}

public class ThreadMethodDemo {
    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass(5, "First");
        ThreadClass t2 = new ThreadClass(8, "Second");

        System.out.println("Current thread: " + Thread.currentThread());
    }
}