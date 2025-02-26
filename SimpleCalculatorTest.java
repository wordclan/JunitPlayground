package at.htlle.pos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    SimpleCalculator calc;

    @BeforeEach
    void setUp() {
        calc = new SimpleCalculator();
    }

    @Test
    void testDiv() {
        float expected = 3.0F;
        float result = calc.div(27, 9);
        assertEquals(expected, result);
    }

    void testDivWithDivisionZero() {
        assertThrows(ArithmeticException.class, () -> calc.div(27, 0));
    }


}