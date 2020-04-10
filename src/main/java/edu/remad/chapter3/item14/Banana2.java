package edu.remad.chapter3.item14;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.*;

public class Banana2 {

    public Banana2() {
    }

    public Banana2(double lengthInCm, String color) {
        if (lengthInCm < 0 || color == null || color.isEmpty()) {
            throw new IllegalStateException();
        }
        length = lengthInCm;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalStateException();
        }
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new IllegalStateException();
        }
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        Banana2 that = (Banana2) o;
        return Double.compare(length, that.length) == 0
                && color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, color);
    }

    public int compareTo(Banana2 bc) {
        return COMPARATOR.compare(this, bc);
    }

    private double length; // Required, length is in centi metres

    private String color;
    private static final Comparator<Banana2> COMPARATOR =
            comparingDouble((Banana2 bc) -> bc.length).thenComparing(bc -> bc.color);
}
