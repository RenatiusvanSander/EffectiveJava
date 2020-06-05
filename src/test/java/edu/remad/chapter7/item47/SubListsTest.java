package edu.remad.chapter7.item47;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SubListsTest {

    private static List<String> strings;

    @BeforeAll
    public static void setUp() {
        strings = List.of("remy", "Pamela", "Imelda", "Keschia", "Danny", "Erika", "Oberbeck");
    }

    @Test
    void ofTest() {
        try (Stream<List<String>> words = SubLists.of(strings)) {
            assertEquals(29, (int) words.count());
        }
    }
}