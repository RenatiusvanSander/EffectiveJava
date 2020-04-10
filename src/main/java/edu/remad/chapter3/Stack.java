package edu.remad.chapter3;

import java.util.EmptyStackException;

import static java.util.Arrays.*;

/**
 * Stack functions like a software stack.
 */
public class Stack {

    public Stack() {
        this.elements = new Object[DEFAUlT_INITIAL_CAPACITY];
    }

    public Object pop() {
        if(size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    @Override
    public  Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    private void ensureCapacity() {
        if(elements.length == size) {
            elements = copyOf(elements, 2 * size + 1);
        }
    }

    private  Object[] elements;
    private int size = 0;
    private  static  final int DEFAUlT_INITIAL_CAPACITY = 16;
}
