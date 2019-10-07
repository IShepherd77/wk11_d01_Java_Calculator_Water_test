import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(99, calculator.add(90, 9));
    }

    @Test
    public void canSubtract(){
        assertEquals(20, calculator.subtract(30, 10));
    }

    @Test
    public void canMultiply(){
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void canDivide(){
        assertEquals(3.0, calculator.divide(15.0, 5.0), 0.01);
    }


}
