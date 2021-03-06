package updateDistance;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationOfCoordinateTest {
  @Test
    public void tetsresultOfCalc() throws Exception {
        CalculationOfCoordinate.setX1(2);
        CalculationOfCoordinate.setX2(5);
        CalculationOfCoordinate.setY1(2);
        CalculationOfCoordinate.setY2(6);

        double actual = CalculationOfCoordinate.resultOfCalc();
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testresultOfCalc1() throws Exception {
        CalculationOfCoordinate.setX1(-3);
        CalculationOfCoordinate.setX2(0);
        CalculationOfCoordinate.setY1(0);
        CalculationOfCoordinate.setY2(-4);

        double actual = CalculationOfCoordinate.resultOfCalc();
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }
}