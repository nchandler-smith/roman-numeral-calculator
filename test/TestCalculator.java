import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestCalculator {

    @Test
    public void testCreation() {
        Calculator calculator = new Calculator();

        assertNotNull(calculator);
        assertTrue(calculator instanceof Calculator);
    }

    @Test
    public void testIPlusIEqualsII(){
        Calculator calculator = new Calculator();

        assertEquals("II", calculator.calculate("I+I"));
    }
}
