package edu.remad.chapter9.item58;

/**
 * Card has a {@link Suit} and {@link Rank}.
 * @author rmeier Remy Meier
 */
public class Card {

    /**
     * Constructs a new Card.
     * @param suit The suit of this card.
     * @param rank The rank of this card.
     */
    public Card(final Suit suit, final Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * @return The {@link Suit} of this card.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @return The {@link Rank} of thi card.
     */
    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + getSuit().toString() +
                ", rank=" + getRank().toString() +
                '}';
    }

    /** the suit */
    private final Suit suit;
    /** the rank */
    private final Rank rank;
}
