package edu.remad.chapter8.item55;

import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class OptionalProductive {

    /**
     * Identifies maximal value of a collection.
     * @param c Collection of an element, for example element is a object.
     * @param <E> The element that is defined by an type class.
     * @return In case of empty collection an empty optional or an optional with a result is returned.
     */
    public static <E extends Comparable<E>> Optional<E> max(Collection<E> c) {
        if(c.isEmpty()) {
            // Empty collection returns an empty optional.
            return Optional.empty();
        }
        E result = null;
        for(E e : c) {
            if(result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }

        return Optional.of(result);
    }

    /**
     * Identifies maximal value of collection via stream.
     * @param c A typesafe collection of something
     * @param <E> This Element is a class
     * @return Maximal value of the given collection
     */
    public static <E extends Comparable<E>> Optional<E> maxViaStream(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }
}
