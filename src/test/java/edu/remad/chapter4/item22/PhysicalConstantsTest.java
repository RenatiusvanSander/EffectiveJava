package edu.remad.chapter4.item22;

import org.junit.Test;

import static edu.remad.chapter4.item22.PhysicalConstants.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link PhysicalConstants}.
 */
public class PhysicalConstantsTest {

    @Test
    public void avogadrosEqualTest() {
        assertEquals(6.022_140_857e23, AVOGADROS_NUMBER);
    }

    @Test
    public void boltzmannConstantEqualTest() {
        assertEquals(1.380_648_52e-23, BOLTZMANN_CONST);
    }

    @Test
    public void electronMassEqualTest() {
        assertEquals(9.109_383_56e-31, ELECTRON_MASS);
    }
}