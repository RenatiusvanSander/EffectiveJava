package edu.remad.chapter5.item30;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * This class handles a type safe set of elements.
 * @param <E> The Type of object you use.
 */
public class GenericTypeSafeSet<E> extends GenericSetImpl<E> {

    public GenericTypeSafeSet() {
        super();
    }

    public GenericTypeSafeSet(Set<E> s) {
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

    // Generic method.
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    private int addCount = 0;
}
