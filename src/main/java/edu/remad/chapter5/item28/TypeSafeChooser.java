package edu.remad.chapter5.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This example presents a list-based and type safe chooser.
 *
 * @author Remy Meier
 */
public class TypeSafeChooser<T> {

    /**
     * Creates a new instance of {@code TypeSafeChooser<T>}.
     */
    public TypeSafeChooser() {
        choice = new ArrayList<>();
    }

    /**
     * Creates a new instance of {@code TypeSafeChooser<T>} and adds all elements of a collection.
     * @param c The Given collection of type {@code T}.
     */
    public TypeSafeChooser(Collection<T> c) {
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
