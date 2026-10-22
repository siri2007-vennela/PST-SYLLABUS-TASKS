import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Division by zero");
        return a / b;
    }
}

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    void testAddition() {
        assertEquals(30, cal.add(10, 20));
    }

    @Test
    void testDivision() {
        assertEquals(5, cal.divide(20, 4));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> cal.divide(10, 0));
    }
}