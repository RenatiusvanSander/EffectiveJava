package edu.remad.chapter5.item26;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;

/**
 * This class handles a type safe set of elements.
 * @param <E> The Type of object you use.
 */
public class TypeSafeSet<E> extends SetForwardImpl<E> {

    public TypeSafeSet() {
        super();
    }

    public TypeSafeSet(Set<E> s) {
        super(s);
        addCount += s.size();
    }

    @Override
    public boolean add(E e) {
        addCount ++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static boolean elementsInCommon(Set<?> set1, Set<?> set2) {
        if(set1 == null || set2 == null || set2.getClass() != set1.getClass()) {
            return false;
        } else if(set1 == set2) {
            return true;
        }

        return set1.equals(set2);
    }

    private int addCount = 0;
}
