package edu.remad.chapter7.item46;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FrequencyTable {

    public static void main(String[] args) {
        Map<String, Long> freq;
        try (Stream<String> words = new Scanner(new File("logs/chats.log")).tokens()) {
            freq = words
                    .collect(groupingBy(String::toLowerCase, counting()));
            List<String> topTen = freq.keySet().stream()
                    .sorted(comparing(freq::get).reversed())
                    .limit(10)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
