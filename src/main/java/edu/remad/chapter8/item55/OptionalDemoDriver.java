package edu.remad.chapter8.item55;

import java.util.Collection;
import java.util.List;

/**
 *
 */
public class OptionalDemoDriver {

    public static void main(String[] args) {
        Collection<String> words = List.of("Cindy", "LAGO", "Java", "Pamela");
        Collection<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22);
        String lastWordInLexicon = OptionalProductive.max(words).orElse("No words ...");
        Integer maximalValue = OptionalProductive.maxViaStream(numbers).orElse(Integer.valueOf(26));
        System.out.println(lastWordInLexicon);
        System.out.printf("Maximal value: %s", maximalValue.toString());
    }
}
