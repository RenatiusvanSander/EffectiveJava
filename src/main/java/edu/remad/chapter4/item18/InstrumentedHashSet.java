package edu.remad.chapter4.item18;

import java.util.Collection;
import java.util.HashSet;

/**
 * This can break when HashSet changes.
 * @param <E> The type of class.
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedHashSet(){}

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        for (E element : c) {
            super.add(element);
        }
        return true;
    }

    public int getAddCount() {
        return  addCount;
    }
}
