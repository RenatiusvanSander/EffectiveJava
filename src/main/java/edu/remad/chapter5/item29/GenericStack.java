package edu.remad.chapter5.item29;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

import static java.util.Arrays.copyOf;

/**
 * GenericStack handles the type in generics.
 * Stack has been refactored to GenericStack.
 *
 * @author Remy Meier
 * @see edu.remad.chapter3.Stack
 */
public class GenericStack<E> {

    // The elements array will contain only E instances from push(E)
    @SuppressWarnings("unchecked")
    public GenericStack() {
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
    public GenericStack<E> clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
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
        GenericStack<E> that = (GenericStack<E>) o;
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
