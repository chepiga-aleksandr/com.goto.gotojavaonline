package Generics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class NumbersExecutorTest {
    @Test
    public void testExecuteWithoutValidator() throws Exception {

        Executor<Number> executor = new NumbersExecutor();
        executor.addTask(new AddTask(5F, 40F));
        executor.execute();
        assertEquals("Wrong execution result", executor.getValidResults().get(0), 45F);
    }

    @Test
    public void testExecuteWithValidator() throws Exception {
        Executor <Number> executor = new NumbersExecutor();
        executor.addTask(new AddTask(5F, -2F), new Validator<Number>() {
            @Override
            public boolean isValid(Number result) {
                return result.doubleValue() > 0;
            }
        });

    }

    private static class AddTask implements Task<Float> {

        private float value1;
        private float value2;

        public AddTask(float value1, float value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        private float result;


        @Override
        public void execute() {

            result = value1 + value2;
        }

        @Override
        public Float getResult() {
            return result;
        }
    }


}