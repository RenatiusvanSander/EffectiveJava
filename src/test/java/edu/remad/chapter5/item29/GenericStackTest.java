package edu.remad.chapter5.item29;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for GenericStack.
 *
 * @author Remy Meier
 */
public class GenericStackTest {

    private static final String NAME_1 = "Pam";
    private static final String NAME_2 = "Keschia";
    private static final String NAME_3 = "Imi";
    private static List<String> list;

    @BeforeAll
    public static void setUp() {
        list = List.of(NAME_1, NAME_2, NAME_3);
    }

    @Test
    public void runGenericStackTest() {
        GenericStack<String> stack = new GenericStack<>();

        for (String item : list) {
            stack.push(item);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }

        assertTrue(stack.isEmpty());
    }

    @Test
    public void isEmptyWhenStackIsConstructedTest() {
        GenericStack<String> stack = new GenericStack<>();

        assertTrue(stack.isEmpty());
    }

    @Test
    public void cloneThrowCloneNotSupportedExceptionTest() {
        GenericStack<String> stack = new GenericStack<>();
        assertThrows(CloneNotSupportedException.class, stack::clone);
    }
}