package edu.remad.chapter9.item58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests via JUnit5 the unit {@link Rank}.
 */
class RankTest {

    @Test
    public void testGetValue() {
        Rank rank = Rank.ACE;
        assertEquals(0, rank.getValue(), 0);
    }

    @Test
    public void testValuesLength() {
        assertEquals(13, Rank.values().length, 0);
    }
}