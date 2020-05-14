package edu.remad.chapter7.item42;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This class presents how a lambda expression replaces obsolete anonymous classes.
 * @author Remy Meier
 */
public class LambdaVsAnonymousClass {

    public LambdaVsAnonymousClass() {}

    /**
     * Sorts a list using sort and a lambda expression.
     * @param args The system given arguments from console.
     */
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Pamela","Keschia", "Poohdi","Imi"));
        System.out.println("Print unsorted words:");
        printWords(words);
        words.sort(Comparator.comparingInt(String::length));
        System.out.println("\nPrint sorted words:");
        printWords(words);
    }

    private static void printWords(List<String> words) {
        for(String word : words) {
            System.out.println(word);
        }
    }
}
