package edu.remad.chapter3.item14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.*;

public class Banana2Test {

    private List<Banana2> bananas;

    @Before
    public void setUp() throws Exception {
        bananas = List.
                of(new Banana2(23.92, "Yellow"),
                        new Banana2(2.99, "green"),
                        new Banana2(7.45, "brown")
                );
    }

    @After
    public void tearDown() throws Exception {
        bananas = null;
    }

    @Test(expected = IllegalStateException.class)
    public void constructorThrowIllegalStateExceptionWhenLengthIsLessThanZeroTest() {
        new Banana2(-34.95, "yellow");
    }

    @Test(expected = IllegalStateException.class)
    public void constructorThrowIllegalStateExceptionWhenColorIsNullTest() {
        new Banana2(11.45, null);
    }

    @Test(expected = IllegalStateException.class)
    public void constructorThrowIllegalStateExceptionWhenColorIsEmptyTest() {
        new Banana2(15.63, "");
    }

    @Test(expected = IllegalStateException.class)
    public void setLengthThrowIllegalStateExceptionWhenNegativeLengthTest() {
        Banana2 banana = new Banana2();
        banana.setLength(-45.56);
    }

    @Test(expected = IllegalStateException.class)
    public void setColorThrowIllegalStateExceptionWhenColorNullTest() {
        Banana2 banana = new Banana2();
        banana.setColor(null);
    }

    @Test(expected = IllegalStateException.class)
    public void setColorThrowIllegalStateExceptionWhenColorIsEmptyTest() {
        Banana2 banana = new Banana2();
        banana.setColor("");
    }

    @Test
    public void bananasCompareByComparatorTest() {
        List<Banana2> actualBananas = new ArrayList<>(bananas);
        Banana2Comparator comparator = new Banana2Comparator();

        // Collections.sort(bananas, comparator);
        actualBananas.sort(comparator);

        assertThat(actualBananas, contains(new Banana2(2.99, "green"),
                new Banana2(7.45, "brown"),
                new Banana2(23.92, "Yellow"))
        );
    }

    @Test
    public void bananasCompareByHashComparatorTest() {
        List<Banana2> actualBananas = new ArrayList<>(bananas);
        Banana2HashComprator comparator = new Banana2HashComprator();

        // Collections.sort(bananas, comparator);
        actualBananas.sort(comparator);

        assertThat(actualBananas, contains(new Banana2(23.92, "Yellow"),
                new Banana2(7.45, "brown"),
                new Banana2(2.99, "green")
                )
        );
    }
}