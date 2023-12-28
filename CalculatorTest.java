import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.subtract(5.0, 2.0), 0.0001);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15.0, calculator.multiply(5.0, 3.0), 0.0001);
    }
}