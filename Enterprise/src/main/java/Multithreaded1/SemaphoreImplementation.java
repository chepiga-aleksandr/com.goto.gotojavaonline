package Multithreaded1;

public class SemaphoreImplementation implements SemaphoreInterface {
    private volatile int availablePermits;
    private final Object lock = new Object();

    public SemaphoreImplementation(int permits) {
        availablePermits = permits;
    }

    @Override
    public void acquire() throws InterruptedException {
        synchronized (lock) {
            while (availablePermits == 0) {
                lock.wait();
            }
            availablePermits--;
            System.out.println("Осталось разрешений " + availablePermits);
        }
    }

    @Override
    public void release() throws InterruptedException {
        synchronized (lock) {
            availablePermits++;
            System.out.println("После release разрешений " + availablePermits);
            lock.notify();
        }
    }

    @Override
    public int getAvailablePermits() {
        return availablePermits;
    }

    @Override
    public void acquire(int permits) throws InterruptedException {
        synchronized (lock) {
            while (getAvailablePermits() < permits) {
                lock.wait();
            }
            availablePermits -= permits;
        }
    }

    @Override
    public void release(int permits) throws InterruptedException {
        synchronized (lock) {
            for (int i = 0; i < permits; i++) {
                lock.notify();
            }
            availablePermits += permits;
        }
    }
}
