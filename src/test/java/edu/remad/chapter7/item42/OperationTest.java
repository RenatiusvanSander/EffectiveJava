package edu.remad.chapter7.item42;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static edu.remad.chapter7.item42.Operation.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for correct math operation of {@link Operation}.
 *
 * @author Remy Meier
 */
public class OperationTest {

    double x = 0;
    double y = 0;

    @BeforeEach
    void setUp() {
        x = 4676.34;
        y = 336.74;
    }

    @Test
    public void operationPlusCorrectResultTest() {
        Operation plus = PLUS;

        double actualPlusResult = plus.apply(x, y);

        assertThat(actualPlusResult, equalTo(x + y));
    }

    @Test
    public void operationMinusCorrectResultTest() {
        double actualMinusResult = MINUS.apply(x, y);

        assertThat(actualMinusResult, equalTo(x - y));
    }

    @Test
    public void operationTimesCorrectResultTest() {
        double actualTimesResult = TIMES.apply(x, y);

        assertThat(actualTimesResult, equalTo(x * y));
    }

    @Test
    public void operationDivideCorrectResultTest() {
        double actualDivideResult = DIVIDE.apply(x, y);

        assertThat(actualDivideResult, equalTo(x / y));
    }
}