package edu.remad.chapter9.item58;

/**
 * Suit has all the Suites that exists.
 * @author Remy Meier
 */
public enum Suit {
    /** The suits with fixed numbers */
    CLUB(0), DIAMOND(1), HEART(2), SPADE(3);

    /**
     * Constructs a Suit.
     * @param number Number of this Suit.
     */
    Suit(final int number) {
        value = number;
    }

    /**
     * @return Value of this suit as {@code int}.
     */
    public int getValue() { return value; }

    @Override
    public String toString() {
        return "Suit{" +
                "value=" + value +
                '}';
    }

    /** Suit value */
    private final int value;
}
