package edu.remad.chapter3.item14;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class BananaTest {

    private List<Banana> bananas;

    @Before
    public void setUp() throws Exception {
        bananas = new ArrayList<>(List.
                of(new Banana(50.344),
                        new Banana(9.34),
                        new Banana(25.34),
                        new Banana(30.65))
        );
    }

    @After
    public void tearDown() throws Exception {
        bananas.clear();
        bananas = null;
    }

    @Test
    public void bananaCompareTest() {
        Collections.sort(bananas);

        assertThat(bananas, contains(new Banana(9.34), new Banana(25.34), new Banana(30.65), new Banana(50.344)));
    }

    @Test(expected = IllegalStateException.class)
    public void constructorThrowIllegalStateExceptionWithNegativeNumberTest() {
        new Banana(-34.56);
    }

    @Test(expected = IllegalStateException.class)
    public void setLengthThrowIllegalStateExceptionWithNegativeNumberTest() {
        Banana testBanana = new Banana(21.43);

        testBanana.setLength(-47.34);
    }

    @Test
    public void setLengthRunWithZeroTest() {
        Banana testBanana = new Banana(21.43);

        testBanana.setLength(0.00);
    }
}