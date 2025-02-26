package at.htlle.pos;

public class SimpleCalculatorTestMain {
    public static void main(String[] args) {
        //testing of the SimpleCalculator

        //setup for the test-class
        SimpleCalculator  calc= new SimpleCalculator();

        //test setup

        //setup for the test
        long expected =3;
        //exercise
        long result = calc.add(1,2);
        //verify
        System.out.println("Test add(1,2) - expected: " + expected+",actual: "+result+" Test-Result: " +(expected==result));
        result = calc.add(Integer.MAX_VALUE,1);


        expected=2;
        result = calc.add(2,0);
        System.out.println("Test add(2,0) - expected: " + expected+",actual: "+result+" Test-Result: " +(expected==result));

        result = calc.add(0,2);
        System.out.println("Test add(0,2) - expected: " + expected+",actual: "+result+" Test-Result: " +(expected==result));

        result = calc.add(2,1);
        expected=3;
        System.out.println("Test add(1,2) - expected: " + expected+",actual: "+result+" Test-Result: " +(expected==result));

        //neutrale Elemente
        result = calc.add(Integer.MAX_VALUE, 1);
        expected = Integer.MAX_VALUE;
        expected++;
        System.out.println("Test add(Integer.MAX_VALUE, 1) - expected: " + expected+",actual: "+result+" Test-Result: " +(expected==result));

        expected = (long)Integer.MIN_VALUE -1;
        result = calc.add(Integer.MIN_VALUE, -1);
        System.out.println("Test (Integer.MIN_VALUE, -1) - expected: " + expected+",actual: "+result+" Test-Result: " +(expected==result));
        System.out.println();

        float divExp = 3;
        float divResult = calc.div(27,9);
        System.out.println("Test div(27,9) - expected: " + divExp+",actual: "+divResult+" Test-Result: " +(divExp==divResult));

        try{
            divResult = calc.div(27,0);
            //if the execution continues it means
            //NO EXCEPTION HAPPENED
            // ==> test failed
            System.out.println("Test div(27,9) - expected: " + divExp+",actual: "+divResult+" Test-Result: " +(divExp==divResult));
            System.out.println("arithmethic exceotion expected but non thrown | TEST RESULT: FALSE");
        }catch(ArithmeticException e){
            System.out.println("arithmethic exception thrown | TEST RESULT: TRUE");
        }


        System.out.println(divResult);

    }
}