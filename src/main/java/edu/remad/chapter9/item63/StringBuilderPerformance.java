package edu.remad.chapter9.item63;

import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.TimeUnit;

/**
 * Demonstrates the speed of {@link StringBuilder}.
 * @author Remy Meier
 */
public class StringBuilderPerformance {

    /**
     * Runs the speed test.
     * @param args Given arguments are empty.
     */
    public static void main(String[] args) {
        StopWatch watchPerformStringConcatenation = new StopWatch();
        watchPerformStringConcatenation.start();
        performStringConcatenation();
        watchPerformStringConcatenation.stop();

        StopWatch watchUseStringBuilder = new StopWatch();
        watchUseStringBuilder.start();
        useStringBuilder();
        watchUseStringBuilder.stop();

        TimeUnit milliseconds = TimeUnit.MILLISECONDS;
        System.out.printf("String concatenation needed %d ms.\n", watchPerformStringConcatenation.getTime(milliseconds));
        System.out.printf("StringBuilder needed %d ms.\n", watchUseStringBuilder.getTime(milliseconds));
    }

    /**
     * @return A string as result of string concatenation.
     */
    public static String performStringConcatenation() {
        String result = "";
        for (int i = 0; i < numItems(); i++) {
            result += lineForItem(i);
        }
        return result;
    }

    /**
     * @return a string concatenated via {@link StringBuilder}.
     */
    public static String useStringBuilder() {
        StringBuilder b = new StringBuilder(numItems() * 10000);
        for (int i = 0; i < numItems(); i++) {
            b.append(lineForItem(i));
        }
        return b.toString();
    }

    /**
     * Method to return the corresponding line for number.
     * @param i The line number
     * @return the line as {@link String}
     */
    private static String lineForItem(int i) {
        return "Pamela";
    }

    /**
     * @return an int of 10000
     */
    private static int numItems() {
        return 10000;
    }
}
