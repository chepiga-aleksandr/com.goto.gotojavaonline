package Multithreaded2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SquareSumImpl implements SquareSum {

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
        int part = values.length/numberOfThreads;
        List<Long> results = new ArrayList<>();
        Phaser phaser = new Phaser(1);

        int start = 0;
        int finish = part;
        for (int i = 0; i < numberOfThreads; i++){
            if (i+1 == numberOfThreads) finish = values.length;
            phaser.register();
            executorService.submit(new AreaCounter(values, start, finish, results, phaser));

            start = start + part;

            finish = finish + part;
        }
        phaser.arriveAndAwaitAdvance();


        phaser.arriveAndDeregister();
        executorService.shutdown();

        long result = 0;
        for(Long number : results){
            result += number;
        }

        return result;
    }
}
