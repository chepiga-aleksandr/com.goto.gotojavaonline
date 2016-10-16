package FiguresV3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void calc() throws Exception {

        Circle circle = new Circle();

        circle.setRadius(10);

        double actual = circle.calc();
        double expected = 314.1592653589793;

        Assert.assertEquals(expected, actual, 0.001);
    }
}