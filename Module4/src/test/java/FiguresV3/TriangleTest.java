package FiguresV3;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void calc() throws Exception {

        Triangle triangle = new Triangle();

        triangle.setWeight(10);
        triangle.setHeight(10);

        double actual = triangle.calc();
        double expected = 50;

        Assert.assertEquals(expected, actual, 0.01);

    }

}