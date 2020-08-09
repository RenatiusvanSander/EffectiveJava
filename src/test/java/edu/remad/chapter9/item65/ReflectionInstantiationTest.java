package edu.remad.chapter9.item65;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingSupplier;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for reflective instantiation via {@link ReflectionInstantiation}
 */
class ReflectionInstantiationTest {

    @Test
    void initializeStringReflective() {
        assertDoesNotThrow((ThrowingSupplier<Class<ClassNotFoundException>>) ReflectionInstantiation::initializeStringReflective);
    }

    @Test
    void getDateClassTest() {
        assertEquals(Date.class, ReflectionInstantiation.getClassType());
    }
}