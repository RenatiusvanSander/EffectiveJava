package edu.remad.chapter8.item52;

/**
 * This class is the base of inheritance for the classes {@link SparklingWine}
 * and {@link Champagne}.
 */
public class Wine {

    String getName() {
        return "wine";
    }

    @Override
    public String toString() {
        return "Wine{ name='" + getName() + "'}";
    }
}
