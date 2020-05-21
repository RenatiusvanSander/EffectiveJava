package edu.remad.chapter6.item39.annotationwithparameter;

import edu.remad.chapter6.item39.markerannotation.Sample;
import edu.remad.chapter6.item39.markerannotation.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Runs the markered annotation inside {@link Sample2} of Test.
 *
 * @author Remy Meier
 */
public class RunTests {

    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Sample2 sample = new Sample2();
        Class<?> testClass = sample.getClass();
        // Class<?> testClass = Class.forName(args[0]); // Do not remove.
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    System.out.printf("Test %s failed: no exception%n", m);
                } catch (InvocationTargetException wrappedEx) {
                    Throwable exc = wrappedEx.getCause();
                    Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
                    if (excType.isInstance(exc)) {
                        passed++;
                    } else {
                        System.out.printf("test %s failed: expected %s, goit %s%n", m, excType.getName(), exc);
                    }
                } catch(Exception exc) {
                    System.out.println("Invaalid @ExceptionTest: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}
