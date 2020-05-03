package edu.remad.chapter4.item24;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MySet<E> extends AbstractSet<E> {

    public MySet() {
        set = new HashSet<>();
        myIterator = new MyIterator(set.iterator());
    }

    public MySet(Collection<? extends E> c) {
        set = new HashSet<>();
        set.addAll(c);
        myIterator = new MyIterator(set.iterator());
    }

    private final MyIterator myIterator;
    private Set<E> set;

    @Override
    public Iterator<E> iterator() {
        return myIterator;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        set.forEach(action);
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return set.removeIf(filter);
    }

    @Override
    public Spliterator<E> spliterator() {
        return set.spliterator();
    }

    @Override
    public Stream<E> stream() {
        return set.stream();
    }

    @Override
    public Stream<E> parallelStream() {
        return set.parallelStream();
    }

    @Override
    public int size() {
        return set.size();
    }

    private class MyIterator implements Iterator<E> {

        public MyIterator(Iterator<E> iterator) {
            this.iterator = iterator;
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public E next() {
            return iterator.next();
        }

        private final Iterator<E> iterator;
    }
}
