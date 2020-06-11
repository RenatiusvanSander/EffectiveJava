package edu.remad.chapter8.item53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class has unit tests for {@link EfficientVarargDemo}
 */
public class EfficientVarargDemoTest {

    @Test
    public void minIsCorrectComputedTest() {
        int[] numbers = {7, 3, 8, 3};
        int firstTestArgument = 5;
        assertEquals(3, EfficientVarargDemo.min(firstTestArgument, numbers));
    }
}