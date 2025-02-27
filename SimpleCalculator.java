package at.htlle.pos;

public class SimpleCalculator {

    // Addition Method
    public long add(int num1, int num2) {
        return (long) num1 + num2;
    }

    // Division Method
    public float div(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException("Potential Division by zero");
        return (float) dividend / divisor;
    }

    public long sub(int num1, int num2) {
        return (long) num1 - num2;
    }

    public long mul(int num1, int num2) {
        return (long) num1 * num2;
    }
}
