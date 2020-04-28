package edu.remad.chapter4.item18;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Unit tests for {@link InstrumentedSet}.
 */
public class InstrumentedSetTest {

    private Set<String> set = Set.of("Remy", "Pamdi", "Pamelali");

    @Test
    public void constructorInstrumentedSetWith3ElementsTest() {
        InstrumentedSet<String> iSet = new InstrumentedSet<>(set);

        assertThat(iSet, containsInAnyOrder("Remy", "Pamdi", "Pamelali"));
        assertThat(iSet.size(), equalTo(3));
    }

    @Test
    public void addMethodsAddsOneEntryTest() {
        InstrumentedSet<String> iSet = new InstrumentedSet<>();
        iSet.add("Pamela");

        Assert.assertThat(iSet, contains("Pamela"));
        Assert.assertThat(iSet.getAddCount(), equalTo(1));
        Assert.assertThat(iSet.size(), equalTo(1));
    }

    @Test
    public void addAllHas3EntriesTest() {
        InstrumentedSet<String> iSet = new InstrumentedSet<>();
        iSet.addAll(set);

        Assert.assertThat(iSet.size(), equalTo(3));
        Assert.assertThat(iSet, containsInAnyOrder("Remy", "Pamdi", "Pamelali"));
    }

    @Test
    public void getAddCountReturns3WhenListAddedTest() {
        InstrumentedSet<String> iSet = new InstrumentedSet<>();
        iSet.addAll(set);

        Assert.assertThat(iSet.getAddCount(), equalTo(3));
    }
}