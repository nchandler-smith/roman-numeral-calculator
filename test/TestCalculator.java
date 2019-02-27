import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestCalculator {

    @Test
    public void testCreation() {
        Calculator calculator = new Calculator();

        assertNotNull(calculator);
        assertTrue(calculator instanceof Calculator);
    }

}
