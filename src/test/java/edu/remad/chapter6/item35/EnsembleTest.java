package edu.remad.chapter6.item35;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for enum Ensemble.
 * @author Remy Meier
 */
public class EnsembleTest {

    @Test
    public void soloCorrectInitializedTest() {
        final Ensemble solo = Ensemble.SOLO;

        assertEquals(1, solo.numberOfMusicians());
    }

    @Test
    public void quartetCorrectInitializedTest() {
        final Ensemble quartet = Ensemble.QUARTET;

        assertEquals(4, quartet.numberOfMusicians());
    }

    @Test
    public void sextetCorrectInitializedTest() {
        final Ensemble sextet = Ensemble.SEXTET;

        assertEquals(6, sextet.numberOfMusicians());
    }

    @Test
    public void triple_quartetCorrectInitializedTest() {
        final Ensemble triple_quartet = Ensemble.TRIPLE_QUARTET;

        assertEquals(12, triple_quartet.numberOfMusicians());
    }
}