package edu.remad.chapter9.item58;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Shows correct use of foreach with {@link Rank} and {@link Suit}.
 * @author Remy Meier
 */
public class CorrectForeachSuitRank {

    private static final Collection<Suit> suits = List.of(Suit.values());
    private static final Collection<Rank> ranks = List.of(Rank.values());

    public static void main(String[] args) {
        Collection<Card> cards = new ArrayList<>();

        for(Suit suit : suits) {
            for(Rank rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }

        cards.forEach(System.out::println);
    }
}