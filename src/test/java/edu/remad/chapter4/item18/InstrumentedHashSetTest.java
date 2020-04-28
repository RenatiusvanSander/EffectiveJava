package edu.remad.chapter4.item18;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.*;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link InstrumentedHashSet}. This tests favor composition over inheritance.
 */
public class InstrumentedHashSetTest {

    private List<String> list;

    @Before
    public void setUp() throws Exception {
        list = List.of("Snap", "Crackle", "Pop");
    }

    @After
    public void tearDown() throws Exception {
        list = null;
    }

    @Test
    public void addMethodsAddsOneEntryCorrectTest() {
        InstrumentedHashSet<String> actualIhs = new InstrumentedHashSet<>();
        actualIhs.add("Pamela");

        assertThat(actualIhs, contains("Pamela"));
        assertThat(actualIhs.getAddCount(), equalTo(1));
        assertThat(actualIhs.size(), equalTo(1));
    }

    @Test
    public void addAllHas3EntriesTest() {
        InstrumentedHashSet<String> actualIhs = new InstrumentedHashSet<>();
        actualIhs.addAll(list);

        assertThat(actualIhs.size(), equalTo(3));
        assertThat(actualIhs, containsInAnyOrder("Snap", "Crackle", "Pop"));
    }

    @Test
    public void getAddCountReturns3WhenListAddedTest() {
        InstrumentedHashSet<String> actualIhs = new InstrumentedHashSet<>();
        actualIhs.addAll(list);

        assertThat(actualIhs.getAddCount(), equalTo(3));
    }
}