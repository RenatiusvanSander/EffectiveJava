package edu.remad.chapter5.item27;

import java.util.Arrays;

/**
 * This class shows how to suppress a warning on level of a local vary.
 */
public class SuppressedWarningArray {

    public static <T> T[] toArray(T[] a, int size) {
        if (a.length < size) {
            /* This ClassCast is correct, because type safety is done correct.
             */
            @SuppressWarnings("unchecked") T[] result = (T[]) Arrays.copyOf(a, size, a.getClass());
            return result;
        }
        System.arraycopy(a, 0, a, 0, size);
        if(a.length > size) {
            a[size] = null;
        }
        return a;
    }
}
