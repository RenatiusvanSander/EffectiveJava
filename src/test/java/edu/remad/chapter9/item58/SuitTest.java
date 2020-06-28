package edu.remad.chapter9.item58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    public void testGetValue() {
        Suit suit = Suit.CLUB;
        assertEquals(Suit.CLUB, suit);
    }

    @Test
    public void testValuesLength() {
        assertEquals(4, Suit.values().length, 0);
    }

}