package edu.remad.chapter7.item45.anagrams;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Anagrams reads a file and stores the alphabetized word as key and the word as value.
 */
public class Anagrams {

    public static void main(String[] args) throws IOException {
        Map<String, Set<String>> groups = new HashMap<>();
        File dictionary = new File("logs/dictionary.file"); // Required file at this drive path.
        int minGroupSize = Integer.parseInt("2"); // Required.

        try(Scanner s = new Scanner(dictionary)) {
            while(s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word), (unused) -> new TreeSet<>()).add(word);
            }
        } catch(IOException ex) {
            ex.printStackTrace();
            throw new IOException(ex);
        }

        for(Set<String> group : groups.values()) {
            if(group.size() >= minGroupSize) {
                System.out.println(group.size() + ": " + group);
            }
        }
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
