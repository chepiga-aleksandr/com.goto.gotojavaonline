package module9;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerTest {
    @Test
    public void testencrypt() throws Exception {

        String actual = Runner.encrypt("wax", 5);

        String expected = "bfc";

        assertEquals(actual, expected);
    }

    @Test
    public void testdecrypt() throws Exception {

        StringBuilder ciphertext = new StringBuilder("bfc");

        String actual = Runner.decrypt(ciphertext);

        String expected = "wax";

        assertEquals(actual, expected);

    }
}