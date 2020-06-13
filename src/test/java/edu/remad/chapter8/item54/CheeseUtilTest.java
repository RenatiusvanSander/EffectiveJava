package edu.remad.chapter8.item54;

import edu.remad.chapter8.item54.CheeseUtil.Cheese;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link CheeseUtil}
 * @author Remy Meier
 */
class CheeseUtilTest {

    @Test
    public void createBlankCheeseUtilTest() {
        assertDoesNotThrow(CheeseUtil::new);
    }

    @Test
    public void getCheesesNotEmptyTest() {
        CheeseUtil util = new CheeseUtil();
        assertFalse(util.getCheeses().isEmpty());
    }

    @Test
    public void getCheesesNotNullIsNotEmptyAndHasSizeBiggerThanZeroTest() {
        CheeseUtil util = new CheeseUtil();
        List<Cheese> cheeses = util.getCheesesNotNull();
        assertFalse(cheeses.isEmpty());
        assertTrue(cheeses.size() > 0);
    }
}