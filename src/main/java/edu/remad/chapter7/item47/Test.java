package edu.remad.chapter7.item47;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Test {

    // Adapter from Iterable<E> to Stream<E>.
    public static <E> Stream<E> streamOf(Iterable<E> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

}
