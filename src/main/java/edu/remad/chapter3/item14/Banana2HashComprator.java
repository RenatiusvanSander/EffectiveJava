package edu.remad.chapter3.item14;

import java.util.Comparator;

public class Banana2HashComprator implements Comparator<Banana2> {

    static Comparator<Object> hashCodeOrder = new Comparator<>() {

        public int compare(Object o1, Object o2) {
            return Integer.compare(o1.hashCode(), o2.hashCode());
        }
    };

    @Override
    public int compare(Banana2 o1, Banana2 o2) {
        return hashCodeOrder.compare(o1, o2);
    }

    /*
    @Override
    public int compare(Banana2 o1, Banana2 o2) {
        return Integer.compare(o1.hashCode(), o2.hashCode());
    }
     */
}
