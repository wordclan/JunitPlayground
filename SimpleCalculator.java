package at.htlle.pos;

public class SimpleCalculator {

    // +
    public long add(int num1, int num2){
        return (long)num1 +num2;

    }

    // -
    // *
    // /

    public float div(int dividend, int divisor){
        if (divisor == 0)throw new ArithmeticException("Potential division by zero");
        return (float) dividend / divisor;
    }


}
