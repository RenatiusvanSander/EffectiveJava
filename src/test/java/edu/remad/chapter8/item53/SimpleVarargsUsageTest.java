package edu.remad.chapter8.item53;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class has the unit tests for {@link SimpleVarargsUsage}.
 * @author Remy Meier
 */
public class SimpleVarargsUsageTest {

    @Test
    public void sumIsCorrectComputedTest() {
        int[] numbers = { 1, 4, 7, 8};
        int actualSum = SimpleVarargsUsage.sum(numbers);
        assertEquals(20, actualSum);
    }

}