package Multithreaded1;

public class RunnerWithParam {

    private SemaphoreImplementation semaphore;
    int count;

    public static void main(String[] args) {

        new RunnerWithParam().testWithParam();
    }

    public void testWithParam() {
        semaphore = new SemaphoreImplementation(5);
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new SimpleThread());
            thread.start();
        }
    }


    class SimpleThread implements Runnable {
        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            int count = 0;
            try {
                System.out.println(name + " in work");
                count++;
                System.out.println("count = " + count);
                System.out.println(name + " acquire");
                semaphore.acquire(5);
                Thread.sleep(5000);
                semaphore.release(5);
                System.out.println(name + " release");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

