package edu.remad.chapter8.item52;

import java.util.List;

/**
 * This class uses classes, which inherit from Wine.
 * @author Remy Meier
 */
public class Overriding {

    public static void main(String[] args) {
        List<Wine> wineList = List.of(new Wine(), new SparklingWine(), new Champagne());

        wineList.forEach(System.out::println);
    }
}
