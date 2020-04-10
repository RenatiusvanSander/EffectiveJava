package edu.remad.chapter3.item14;

import java.util.Comparator;

public class Banana2Comparator implements Comparator<Banana2> {

    private static final Comparator<Banana2> COMPARATOR = Comparator
            .comparing(Banana2::getLength)
            .thenComparing(Banana2::getColor);

    public int compare(Banana2 o1, Banana2 o2) {
        return COMPARATOR.compare(o1, o2);
    }
}
