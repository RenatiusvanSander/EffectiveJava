package edu.remad.chapter5.item28;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TypeSafeChooserTest {

    private static final String NAME_1 = "Consti";
    private static final String NAME_2 = "Rene";
    private static final String NAME_3 = "Klaus";
    private static final String NAME_4 = "Maximilian";
    private List<Object> list;


    @BeforeEach
    void setUp() {
        list = List.of(NAME_1, NAME_2, NAME_3, NAME_4);
    }

    @AfterEach
    void tearDown() {
        list = null;
    }

    @Test
    public void runStandardConstructorTest() throws Exception {
        TypeSafeChooser<Object> typeSafeChooser = new TypeSafeChooser<>();
    }

    @Test
    public void runSecondaryConstructorWithOneArgumentTest() throws Exception {
        TypeSafeChooser<Object> typeSafeChooser = new TypeSafeChooser<>(list);
    }

    @Test
    public void chooseReturnOneOfListTest() {
        TypeSafeChooser<Object> typeSafeChooser = new TypeSafeChooser<>(list);

        Object chooseRandomReturnedObject = typeSafeChooser.choose();

        assertThat(chooseRandomReturnedObject, Matchers.isOneOf(NAME_1, NAME_2, NAME_3, NAME_4));
    }
}