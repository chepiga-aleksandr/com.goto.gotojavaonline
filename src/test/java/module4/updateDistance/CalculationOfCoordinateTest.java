package module4.updateDistance;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationOfCoordinateTest {
    @Test
    public void resultOfCalc() throws Exception {
        CalculationOfCoordinate.setX1(2);
        CalculationOfCoordinate.setX2(5);
        CalculationOfCoordinate.setY1(2);
        CalculationOfCoordinate.setY2(6);

        double actual = CalculationOfCoordinate.resultOfCalc();
        double expected = 5;

        assertEquals(expected, actual, 0.001);
    }
}