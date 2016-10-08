package Enterprise.Multithreaded1;

public class SemaphoreImplementation implements SemaphoreInterface {
    private volatile int permits;
    private final Object lock = new Object();

    public SemaphoreImplementation(int permits) {
        this.permits = permits;
    }

    @Override
    public void acquire() throws InterruptedException {
        synchronized (lock) {
            while (permits == 0) {
                lock.wait();
            }
            permits--;
            System.out.println("Осталось разрешений " + permits);
        }
    }

    @Override
    public void release() throws InterruptedException {
        synchronized (lock) {
            permits++;
            System.out.println("После release разрешений " + permits );
            lock.notify();
        }
    }

    @Override
    public int getAvailablePermits() {
        return permits;
    }

    @Override
    public void acquire(int permits) throws InterruptedException {
        synchronized (lock) {

            if (permits <= getAvailablePermits()){

            }
            while (this.permits < permits) {
                lock.wait();
            }
            this.permits--;
        }
    }

    @Override
    public void release(int permits) throws InterruptedException {
        synchronized (lock) {
            this.permits += permits;
            for (int i = 0; i < permits; i++) {
                lock.notify();
            }
        }
    }
}
