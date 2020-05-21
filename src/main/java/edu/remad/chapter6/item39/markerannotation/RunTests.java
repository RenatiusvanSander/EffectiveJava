package edu.remad.chapter6.item39.markerannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Runs the markered annotation inside {@link Sample} of Test.
 * @author Remy Meier
 */
public class RunTests {

    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Sample sample = new Sample();
        Class<?> testClass = sample.getClass();
        // Class<?> testClass = Class.forName(args[0]); // Do not remove.
        for(Method m : testClass.getDeclaredMethods()) {
            if(m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch(InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch(Exception ex) {
                    System.out.println("Invalid @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n", passed, tests - passed);
    }
}
