package edu.remad.chapter5.item30;

import org.junit.jupiter.api.*;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GenericTypeSafeSetTest {

    private static final String NAME_1 = "Tom";
    private static final String NAME_2 = "Dick";
    private static final String NAME_3 = "Harry";
    private static Set<String> set;

    @BeforeAll
    static void setUp() {
        set = Set.of(NAME_1, NAME_2, NAME_3);
    }

    @AfterAll
    static void tearDown() {
        set = null;
    }

    @Test
    public void exerciseGenericTypeSafeSetTest() {
        Set<String> guys = Set.of(NAME_1, NAME_2, NAME_3);
        Set<String> stooges = Set.of("Larry", "Moe", "Curly");
        Set<String> aflCio = GenericTypeSafeSet.union(guys, stooges);
        System.out.println(aflCio);
    }


}