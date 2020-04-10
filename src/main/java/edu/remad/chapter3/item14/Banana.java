package edu.remad.chapter3.item14;

import java.util.Objects;

public class Banana implements Comparable<Banana> {

    public Banana() {}

    public Banana(double lengthInCm) {
        if(lengthInCm < 0) {
            throw new IllegalStateException();
        }
        length = lengthInCm;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0) {
            throw new IllegalStateException();
        }
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        Banana that = (Banana) o;
        return Double.compare(length, that.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }

    @Override
    public int compareTo(Banana o) throws ClassCastException{
        return Double.compare(length, o.length);
    }

    private double length; // Required, length is in centi metres
}
