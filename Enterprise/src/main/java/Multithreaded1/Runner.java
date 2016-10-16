package Multithreaded1;

public class Runner {
    private SemaphoreImplementation semaphore;

    public static void main(String[] args) {
        new Runner().test(10);
    }

    public void test(final int SIZE) {
        semaphore = new SemaphoreImplementation(5);

        for (int i = 1; i <= SIZE; i++) {
            Thread thread = new Thread(new Worker());
            thread.start();
        }
    }

    public class Worker implements Runnable {
        @Override
        public void run() {
            try {
                String name = Thread.currentThread().getName();
                System.out.println(name + " запрашивает разрешение");
                semaphore.acquire();
                System.out.println(name + " получил разрешение");
                Thread.sleep(5000);
                System.out.println(name + " отпускает разрешение");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}