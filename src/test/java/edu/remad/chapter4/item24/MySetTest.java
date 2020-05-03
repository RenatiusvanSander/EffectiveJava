package edu.remad.chapter4.item24;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import java.util.Iterator;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {

    private static final Set<String> set = Set.of("Ronny", "Bronski", "Skanski");

    @AfterEach
    void tearDown() {
    }

    @Test
    public void mySetTest() {
        MySet<String> mySet = new MySet<>(set);

        assertThat(mySet, containsInAnyOrder("Ronny", "Bronski", "Skanski"));
    }

    @Test
    public void mySetIteratorIsNotNullTest() {
        MySet<String> mySet = new MySet<>(set);

        Iterator<String> actualIterator = mySet.iterator();

        assertNotNull(actualIterator);
    }

    @Test
    public void mySetStandardConstructorSetIteratorNotNullTest() {
        MySet<String> mySet = new MySet<>();

        Iterator<String> actualIterator = mySet.iterator();

        assertNotNull(actualIterator);
    }
}