package edu.remad.chapter6.item36;

import org.junit.jupiter.api.*;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

import static edu.remad.chapter6.item36.Text.*;
import static edu.remad.chapter6.item36.Text.Style.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TextTest {

    private static Set<Style> firstSet;
    private static Set<Style> secondSet;

    @BeforeAll
    private static void setUp() {
        firstSet = EnumSet.of(BOLD, ITALIC);
        secondSet = EnumSet.of(UNDERLINE, STRIKETHROUGH);
    }

    @AfterAll
    private static void tearDown() {
        firstSet = null;
        secondSet = null;
    }

    @Test
    public void runApplyStyles() {
        Text text = new Text();
        text.applyStyles(firstSet);
    }

    @Test
    public void returnCheckedStylesSetThrowIllegalStateExceptionWhenStyleNotACaseTest() {
        Text text = new Text();

        text.applyStyles(Collections.emptySet());

        assertThrows(IllegalStateException.class, text::returnCheckedStylesSet);
    }

    @Test
    public void returnCheckedStylesSetReturnFirstSetCorrectTest() {
        Text text = new Text();

        text.applyStyles(firstSet);

        assertThat(text.returnCheckedStylesSet(), equalTo(firstSet));
    }

    @Test
    public void returnCheckedStylesSetReturnSecondSetCorrectTest() {
        Text text = new Text();

        text.applyStyles(secondSet);

        assertThat(text.returnCheckedStylesSet(), equalTo(secondSet));
    }
}