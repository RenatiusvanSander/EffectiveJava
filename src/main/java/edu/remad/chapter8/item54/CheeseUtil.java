package edu.remad.chapter8.item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * This class demonstrates to return not null lists and collections.
 * @author Remy Meier
 */
public class CheeseUtil {

    /**
     * Constructor
     */
    public CheeseUtil() {
        cheeseInStock = createCheeses();
    }

    /**
     * @return list of cheeses in stock.
     */
    public List<Cheese> getCheeses() {
        return new ArrayList<>(cheeseInStock);
    }

    /**
     * @return Returns either a empty list in case stock is empty or in case the stock is not empty the cheeses.
     */
    public List<Cheese> getCheesesNotNull() {
        return cheeseInStock.isEmpty() ? Collections.emptyList()
                : new ArrayList<>(cheeseInStock);
    }

    /**
     * @return Immutable list of cheeses.
     */
    private List<Cheese> createCheeses() {
        Cheese tilsiter = new Cheese();
        tilsiter.setName("Tilsiter");

        Cheese gouda = new Cheese();
        gouda.setName("Gouda");

        Cheese esmerom = new Cheese();
        esmerom.setName("Esmerom");

        Cheese pizzaCheese = new Cheese();
        pizzaCheese.setName("Pizza Käse");

        return List.of(tilsiter, gouda, esmerom, pizzaCheese);
    }

    /**
     * This class is a cheese.
     *
     * @author Remy Meier
     */
    public class Cheese {

        /**
         * Constructor
         */
        public Cheese() {
        }

        /**
         * @return name of cheese
         */
        public String getName() {
            return name;
        }

        /**
         * Sets name of cheese.
         *
         * @param name name of cheese
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * Equals o to this object.
         *
         * @param o The object that shall be equal.
         * @return In case of equality is returned {@code true}.
         * In case of none equality or null is returned {@code false}.
         */
        public boolean equals(Object o) {
            if (getName() == null || o == null || getClass() != o.getClass()) {
                return false;
            }
            if (o == this) {
                return true;
            }
            Cheese that = (Cheese) o;
            return getName().equals(that.getName());
        }

        /**
         * Computes the has code for ths object.
         * @return number.
         */
        @Override
        public int hashCode() {
            return Objects.hash(Objects.requireNonNull(getName()));
        }

        /**
         * @return This class as string content.
         */
        @Override
        public String toString() {
            return "Cheese{" +
                    "name='" + getName() + '\'' +
                    '}';
        }

        /** the name of this cheese */
        private String name;
    }

    /** Cheeses in stock */
    private final List<Cheese> cheeseInStock;
}
