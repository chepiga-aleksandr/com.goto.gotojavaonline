package module4.module4FiguresV3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void calc() throws Exception {

        Rectangle rectangle = new Rectangle();

        rectangle.setHeight(10);
        rectangle.setWeight(10);

        double actual = rectangle.calc();
        double expected = 100;

        assertEquals(expected, actual, 0.01);

    }

}