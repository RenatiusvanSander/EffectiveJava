package edu.remad.chapter9.item61;

import java.util.Comparator;

/**
 * Compares Integer.
 * @author Remy Meier
 */
public class CompareInteger {

    /**
     * Constructs CompareInteger.
     */
    public CompareInteger() {
    }

    /**
     * Uses the comparator on Integers.
     */
    public void useComparator() {
        Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
            int i = iBoxed, j = jBoxed;
            return i < j ? -1 : (i == j ? 0 : 1);
        };
    }
}
