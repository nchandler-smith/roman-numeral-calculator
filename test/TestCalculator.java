import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testCreation() {
        assertNotNull(calculator);
        assertTrue(calculator instanceof Calculator);
    }

    @Test
    public void testIPlusIEqualsII() {
        assertEquals("II", calculator.calculate("I+I"));
    }

    @Test
    public void testIPlusIIEqualsIII() {
        assertEquals("III", calculator.calculate("I+II"));
    }

    @Test
    public void testIIPlusIIIEqualsV() {
        assertEquals("V", calculator.calculate("II+III"));
    }

    @Test
    public void testIIIPlusIIIEqualsVI() {
        assertEquals("VI", calculator.calculate("III+III"));
    }

    @Test
    public void testIIPlusIIEqualsIV() {
        assertEquals("IV", calculator.calculate("II+II"));
    }

    @Test
    public void testVPlusVEqualsX() {
        assertEquals("X", calculator.calculate("V+V"));
    }
}
