package edu.remad.chapter5.item27;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Unit tests for {@link SuppressedWarningArray}
 */
public class SuppressedWarningArrayTest {

    private String[] array;

    @BeforeEach
    void setUp() {
        array = new String[]{"Test", "Pam", "Sex", "Bed"};
    }

    @AfterEach
    void tearDown() {
        array = null;
    }

    @Test
    public void toArrayCreateArrayIndex2IsNullTest() {
        String[] smallerArray = SuppressedWarningArray.toArray(array, 2);

        assertNull(smallerArray[2]);
    }

    @Test
    public void toArrayCreateArrayOfLength4Test() {
        String[] smallerArray = SuppressedWarningArray.toArray(array, 2);

        assertEquals(4, smallerArray.length);
    }

    @Test
    public void toArrayCreateArrayAndContainFieldsTest() {
        String[] smallerArray = SuppressedWarningArray.toArray(array, 2);

        assertThat(smallerArray, arrayContainingInAnyOrder("Test", "Pam", "Bed", null));
    }

    @Test
    public void toArrayCreateBiggerArrayWhenArrayLengthIsLessSizeTest() {
        int biggerSize = 6;
        String[] smallerArray = new String[]{"Test", "Pam", "Sex", "Bed"};

        String[] actualArray = SuppressedWarningArray.toArray(smallerArray, biggerSize);

        assertThat(actualArray, arrayContaining("Test", "Pam", "Sex", "Bed", null, null));
    }

    @Test
    public void toArrayCreateArrayOfVarySizeTest() {
        int biggerSize = 6;
        String[] smallerArray = new String[]{"Test", "Pam", "Sex", "Bed"};

        String[] actualArray = SuppressedWarningArray.toArray(smallerArray, biggerSize);

        assertThat(actualArray, arrayWithSize(6));
    }
}