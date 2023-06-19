import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before

    public void before(){
        calculator = new Calculator(5.50, 10, 20);
    }
    @Test
    public void hasNumber1(){
        assertEquals(5.50, calculator.getNumber1(), 0.0);
    }
    @Test
    public void hasNumber2(){
        assertEquals(10, calculator.getNumber2());
    }

    @Test
    public void canMultiply(){
        assertEquals(200, calculator.getMultiply());
    }

    @Test
    public void canAdd(){
        assertEquals(30, calculator.getAdd());
    }

    @Test
    public void canSubtract(){
        assertEquals(10, calculator.getSubtract());
    }

    @Test
    public void canDivide(){
        assertEquals(3.64, calculator.getDivide(), 0.1);
    }

}
