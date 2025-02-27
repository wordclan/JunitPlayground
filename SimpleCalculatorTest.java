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
        float result = calc.div(27,9);
        assertEquals(expected, result);
    }

    @Test
    void testDivWithDivisionZero(){
        assertThrows(ArithmeticException.class, () -> calc.div(27,0));
    }

    @Test
    void testAddition() {
        long expected = 10L;
        long result = calc.add(6,4);
        assertEquals(expected, result);
    }

    @Test
    void testSubtraction() {
        long expected = 2L;
        long result = calc.sub(6,4);
        assertEquals(expected, result);
    }

    @Test
    void testMultiplication() {
        long expected = 0L;
        long result = calc.mul(20,0);
        assertEquals(expected, result);
    }
}