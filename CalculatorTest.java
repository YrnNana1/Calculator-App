import static org.junit.Assert.assertEquals;
import org.junit.Test;

//Test class for calculator class
public class CalculatorTest {

    // Tests the add method with positive numbers.
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
    }

    // Tests the add method with negative numbers.
    @Test
    public void testNegAdd() {
        Calculator calculator = new Calculator();
        assertEquals(-5.0, calculator.add(-3.0, -2.0), 0.0001);
    }

    // Tests the subtract method with postive numbers.
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.subtract(5.0, 2.0), 0.0001);
    }

    // Tests the subtract method with negative numbers.
    @Test
    public void testNegSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-3.0, calculator.subtract(-5.0, -2.0), 0.0001);
    }

    // Tests the multiply method with postive numbers.
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15.0, calculator.multiply(5.0, 3.0), 0.0001);
    }

    // Tests the multiply method with negative numbers.
    @Test
    public void testNegMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(-10.0, calculator.multiply(5.0, -2.0), 0.0001);
    }

    // Tests the percent method.
    @Test
    public void testPercent() {
        Calculator calculator = new Calculator();
        assertEquals(0.05, calculator.percent(5.0), 0.0001);
    }

    // Test the negate method with positive numbers.
    @Test
    public void testNegate() {
        Calculator calculator = new Calculator();
        assertEquals(-5.0, calculator.negate(5.0), 0.0001);
    }

    // Test the negate method with negative numbers.
    @Test
    public void testNegate2() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.negate(-5.0), 0.0001);
    }

}