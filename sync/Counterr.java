package sync;

class Counterr {
    private int count;

    public synchronized void increment() {
        count += 1;
    }

    public synchronized int getCount() {
        return count;
    }
}
