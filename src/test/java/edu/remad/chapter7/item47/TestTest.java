package edu.remad.chapter7.item47;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    private static Collection<String> strings;

    @BeforeAll
    public static void setUp() {
        strings = List.of("remy","Pamela","Imelda", "Keschia", "Danny", "Erika","Oberbeck");
    }

    @Test
    void streamOfReturnEqual7Test() {
        Stream<String> stringStream = edu.remad.chapter7.item47.Test.streamOf(strings);

        assertEquals(7, (int)stringStream.count());
    }
}