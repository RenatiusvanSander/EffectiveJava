package edu.remad.chapter9.item58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the {@link Card} with JUnit5.
 * @author Remy Meier
 */
class CardTest {

    @Test
    public void testCardConstructor() throws ExceptionInInitializerError{
        Suit suit = Suit.valueOf("CLUB");
        Rank rank = Rank.valueOf("JACK");
        Card card = new Card(suit, rank);
    }

    @Test
    public void testGetSuit() {
        Suit suit = Suit.DIAMOND;
        Rank rank = Rank.ACE;
        Card card = new Card(suit, rank);
        assertEquals(Suit.DIAMOND, card.getSuit(), "Suit of Card meets expectation.");
    }

    @Test
    public void testGetRank() {
        Suit suit = Suit.DIAMOND;
        Rank rank = Rank.ACE;
        Card card = new Card(suit, rank);
        assertEquals(Rank.ACE, card.getRank(), "Rank of Card meets expectation.");
    }
}