package module4.updateTemperature;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertTemperatureTest {

    @Test(timeout = 3000)
    public void testconvertToCelsius() throws Exception {

        ConvertTemperature.setInputValue(33.8);

        double actual = ConvertTemperature.convertToCelsius();
        double expected = 1;

        assertEquals(actual, expected, 0.001);
    }

    @Test(timeout = 3000)
    public void testconvertToFahrenheit() throws Exception {

        ConvertTemperature.setInputValue(10);
        double actual = ConvertTemperature.convertToFahrenheit();
        double expected = 50;

        assertEquals(actual, expected, 0);
    }
}