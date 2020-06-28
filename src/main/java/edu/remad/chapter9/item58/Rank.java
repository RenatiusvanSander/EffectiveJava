package edu.remad.chapter9.item58;

/**
 * Rank describes the given rank.
 *
 * @author Remy Meier
 */
public enum Rank {
    ACE(0), DEUCE(1), THREE(2), FOUR(3), FIVE(4), SIX(5),
    SEVEN(6), EIGHT(7), NINE(8), TEN(9), JACK(10),
    QUEEN(11), KING(12);

    /**
     * Constructs the rank with a numbered value.
     *
     * @param valueAsInt The value of rank is in {@code int}.
     */
    Rank(final int valueAsInt) {
        value = valueAsInt;
    }

    /**
     * @return Th value of this rank as {@code int}.
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "value=" + value +
                '}';
    }

    /**
     * Value of this rank
     */
    private final int value;
}
