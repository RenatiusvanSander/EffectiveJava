package edu.remad.chapter7.item43;

import java.util.Map;
import java.util.TreeMap;

/**
 * Freq shows 
 */
public class Freq {

    public static void main(String[] argss) {
        Map<String, Integer> frequencyTable = new TreeMap<>();
        String[] args = new String[] {"Pam", "Remy", "Imi","Keschia"};

        int intcr = 1;
        for (String s : args) {
            frequencyTable.merge(s, intcr, (count, incr) -> count + incr); // Lambda
            intcr++;
        }
        System.out.println(frequencyTable);

        int incr = 1;
        frequencyTable.clear();
        for (String s : args) {
            frequencyTable.merge(s, incr, Integer::sum); // Method reference
            incr++;
        }
        System.out.println(frequencyTable);

    }
}