import static org.junit.Assert.assertEquals;
import org.jnit.Test;



public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.0001);
    }
    @Test
    public void testNegAdd() {
        Calculator calculator = new Calculator();
        assertEquals(-5.0, calculator.add(-3.0, -2.0), 0.0001);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.subtract(5.0, 2.0), 0.0001);
    }

    @Test
    public void testNegSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-3.0, calculator.subtract(-5.0, -2.0), 0.0001);
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15.0, calculator.multiply(5.0, 3.0), 0.0001);
    }
    @Test
    public void testNegMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(-10.0, calculator.multiply(5.0, -2.0), 0.0001);
    }

    @Test
    public void testDivide(){
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.0001);
    }

    @Test
    public void testNegDivide(){
        Calculator calculator = new Calculator();
        assertEquals(-2.0, calculator.divide(-6.0, 3.0), 0.0001);
    }

    @Test
    public void testDivideZero(){
        Calculator calculator = new Calculator();
        assertEquals(Double.POSITIVE_INFINITY, calculator.divide(10.0, 0.0), 0.0001);
    }
    @Test
    public void testPercent(){
        Calculator calculator = new Calculator();
        assertEquals(0.05, calculator.percent(5.0), 0.0001);
    }
    @Test 
    public void testNegate(){
        Calculator calculator  = new Calculator();
        assertEquals(-5.0, calculator.negate(5.0), 0.0001);
    }
    @Test 
    public void testNegate2(){
        Calculator calculator  = new Calculator();
        assertEquals(5.0, calculator.negate(-5.0), 0.0001);
    }
    

} 