import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator(10, 5);
    }

    @Test
    public void checkAdd(){
        assertEquals(15, calculator.add(), 0.01);
    }

    @Test
    public void checkSubtract(){
        assertEquals(5, calculator.subtract(), 0.01);
    }

    @Test
    public void checkMultiply(){
        assertEquals(50, calculator.multiply(), 0.01);
    }

    @Test
    public void checkDivide(){
        assertEquals(2, calculator.divide(), 0.01);
    }
}
