package edu.remad.chapter6.item39.annotationwithparameter;

/**
 * Program containing annotation with a parameter and is run by driver {@link edu.remad.chapter6.item39.markerannotation.RunTests}.
 *
 * @author Remy Meier
 */
public class Sample2 {

    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int i = 0;
        i = i / i;
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m2() {
        int[] a = new int[0];
        int i = a[1];
    }

    @ExceptionTest(ArithmeticException.class)
    public static void m3() {}

}
