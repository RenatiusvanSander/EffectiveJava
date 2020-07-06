package edu.remad.chapter9.item60;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests to run without exception {@link ExactBigDecimalDriver}.
 * @author Remy Meier
 */
public class ExactBigDecimalDriverTest {

    @Test
    public void testExactBigDecimalDriver() {
        assertDoesNotThrow(ExactBigDecimalDriver::new);
    }
}