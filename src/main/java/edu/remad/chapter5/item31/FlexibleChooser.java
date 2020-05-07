package edu.remad.chapter5.item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This example presents a list-based and type safe flexible chooser.
 * @author Remy Meier
 */
public class FlexibleChooser<T> {

    /**
     * Creates a new instance of {@code TypeSafeChooser<T>}.
     */
    public FlexibleChooser() {
        choice = new ArrayList<>();
    }

    /**
     * Creates a new instance of {@code TypeSafeChooser<T>} and adds all elements of a collection.
     * @param c The Given collection of type {@code T}.
     */
    public FlexibleChooser(Collection<? extends T> c) {
        choice = new ArrayList<>(c);
    }

    /**
     * @return Returns a random Element of this {@code List<T>}.
     */
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choice.get(rnd.nextInt(choice.size()));
    }

    private final List<T> choice;
}
