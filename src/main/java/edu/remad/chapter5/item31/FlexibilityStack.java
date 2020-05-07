package edu.remad.chapter5.item31;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Objects;

import static java.util.Arrays.copyOf;

/**
 * FlexibilityStack handles the type of wild cards.
 * Stack has been refactored to Stack.
 *
 * @author Remy Meier
 * @see edu.remad.chapter3.Stack
 */
public class FlexibilityStack<E> {

    // The elements array will contain only E instances from push(E)
    @SuppressWarnings("unchecked")
    public FlexibilityStack() {
        elements = (E[]) new Object[DEFAUlT_INITIAL_CAPACITY];
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = (E) elements[--size];
        elements[size] = null;
        return result;
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public boolean isEmpty() {
        int countedEmptyElements = 0;
        for (E element : elements) {
            if (element == null) {
                countedEmptyElements++;
            }
        }
        return countedEmptyElements == elements.length;
    }

    @Override
    public FlexibilityStack<E> clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    /**
     * Pushes wild card type for a parameter that serves as an E producer.
     * @param src The given wild card {@code Iterable<?>}
     */
    public void pushAll(Iterable<? extends E> src) {
        for(E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super  E> dst) {
        while(!isEmpty()) {
            dst.add(pop());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        // This type cast is correct, because instance is tested above.
        @SuppressWarnings("unchecked")
        FlexibilityStack<E> that = (FlexibilityStack<E>) o;
        return size == that.size
                && Arrays.equals(elements, that.elements);
    }

    public int hashCode() {
        return Objects.hash(size, elements);
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = copyOf(elements, 2 * size + 1);
        }
    }

    private E[] elements;
    private int size = 0;
    private static final int DEFAUlT_INITIAL_CAPACITY = 16;
}
