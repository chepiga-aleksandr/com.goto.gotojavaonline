package Enterprise.Multithreaded1;

public class Runner {

    private SemaphoreImplementation semaphore;

    public static void main(String[] args) {
        new Runner().test(10);
    }
    public void test(final int SIZE) {

        semaphore = new SemaphoreImplementation(5);

        for (int i = 1; i < SIZE; i++) {
            Thread thread = new Thread(new Worker());
            thread.start();
        }
    }
    public class Worker implements Runnable {
        @Override
        public void run() {
            try {
                semaphore.acquire();

                System.out.println("Поток № " + "" + Thread.currentThread().getName() + " " + "ожидает разрешения");
                semaphore.release();
                System.out.println("Поток № " + Thread.currentThread().getName() + " " + "получил разрешение");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

