package edu.remad.chapter6.item37;

import java.util.*;

/**
 * This handles a plant with a name and LifeCycle enum.
 */
public class Plant {

    enum LifeCycle {ANNUAL, PERENIAL, BIENNIAL}

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Plant p1 = new Plant("Pambaum", LifeCycle.ANNUAL);
        Plant p2 = new Plant("Pamelablume",LifeCycle.BIENNIAL);
        Plant p3 = new Plant("Pamelali", LifeCycle.PERENIAL);
        List<Plant> garden = List.of(p1, p2, p3);

        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
        for(Plant.LifeCycle lc : Plant.LifeCycle.values()) {
            plantsByLifeCycle.put(lc, new HashSet<>());
        }
        for(Plant p: garden) {
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        }
        System.out.println(plantsByLifeCycle);
    }
}
