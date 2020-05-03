package edu.remad.chapter5.item26;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ConstantConditions")
public class TypeSafeSetTest {

    private static final String NAME_1 = "Keschia";
    private static final String NAME_2 = "Pamelali";
    private static final String NAME_3 = "Imi";
    private static final List<String> list = List.of(NAME_1, NAME_2, NAME_3);

    @Test
    public void runConstructorCreateEmptySetTest() {
        TypeSafeSet<String> tsSet = new TypeSafeSet<>();

        assertNotNull(tsSet);
        assertTrue(tsSet.isEmpty());
    }

    @Test
    public void runSecondaryConstructorCreateSetContainsStrngsOfListTest() {
        TypeSafeSet<String> tsSet = new TypeSafeSet<>(new HashSet<>(list));

        assertThat(tsSet, containsInAnyOrder(NAME_1, NAME_2, NAME_3));
    }

    @Test
    public void runSecondaryConstructorCreateNotEmptySetTest() {
        TypeSafeSet<String> tsSet = new TypeSafeSet<>(new HashSet<>(list));

        assertFalse(tsSet.isEmpty());
    }

    @Test
    public void getCountEqual3WhenListAddedTest() {
        TypeSafeSet<String> tsSet = new TypeSafeSet<>(new HashSet<>(list));

        assertEquals(3, tsSet.getAddCount());
    }

    @Test
    public void getCountEqual1WhenName1AddedTest() {
        TypeSafeSet<String> tsSet = new TypeSafeSet<>();

        tsSet.add(NAME_1);

        assertEquals(1, tsSet.getAddCount());
    }

    @Test
    public void TypeSafeSetStoreName1WhentName1AddedTest() {
        TypeSafeSet<String> tsSet = new TypeSafeSet<>();

        tsSet.add(NAME_1);

        assertThat(tsSet, contains(NAME_1));
    }

    @Test
    public void TypeSafeSetStoreName1Name2Name3WhenAddAllAddListTest() {
        TypeSafeSet<String> tsSet = new TypeSafeSet<>();

        tsSet.addAll(list);

        assertThat(tsSet, containsInAnyOrder(NAME_1, NAME_2, NAME_3));
    }

    @Test
    public void elementsInCommonFalseWhenSet1IsNullTest() {
        Set<String> set1 = null;
        Set<String> set2 = Set.of(NAME_1, NAME_2);

        boolean elementsAreNotInCommon = TypeSafeSet.elementsInCommon(set1, set2);

        assertFalse(elementsAreNotInCommon);
    }

    @Test
    public void elementsInCommonFalseWhenSet2IsNullTest() {
        Set<String> set1 = Set.of(NAME_1, NAME_2);
        Set<String> set2 = null;

        boolean elementsAreNotInCommon = TypeSafeSet.elementsInCommon(set1, set2);

        assertFalse(elementsAreNotInCommon);
    }

    @Test
    public void elementsInCommonFalseWhenSet2InstanceNotSameClassTest() {
        Set<String> set1 = Set.of(NAME_1, NAME_2);
        Set<Integer> set2 = Set.of(1, 5);

        boolean elementsAreNotInCommon = TypeSafeSet.elementsInCommon(set1, set2);

        assertFalse(elementsAreNotInCommon);
    }

    @Test
    public void elementsInCommonTrueWhenSet1AndSet2ReferenceEqualTest() {
        Set<String> set1 = Set.of(NAME_1, NAME_2);

        boolean elementsAreInCommon = TypeSafeSet.elementsInCommon(set1, set1);

        assertTrue(elementsAreInCommon);
    }

    @Test
    public void elementsInCommonTrueWhenSet1AndSet2EqualsTest() {
        Set<String> set1 = Set.of(NAME_1, NAME_2);
        Set<String> set2 = Set.of(NAME_1, NAME_2);

        boolean elementsAreInCommon = TypeSafeSet.elementsInCommon(set1, set2);

        assertTrue(elementsAreInCommon);
    }

    @Test
    public void elementsInCommonFalseWhenSet2NotEqualTest() {
        Set<String> set1 = Set.of(NAME_1, NAME_2);
        Set<String> set2 = Set.of(NAME_1, NAME_3);

        boolean elementsAreNotInCommon = TypeSafeSet.elementsInCommon(set1, set2);

        assertFalse(elementsAreNotInCommon);
    }
}