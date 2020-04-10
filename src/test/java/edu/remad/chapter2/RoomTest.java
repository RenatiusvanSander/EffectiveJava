package edu.remad.chapter2;

import org.junit.Test;

/**
 * Unit tests for {@link Room rooms}.
 */
public class RoomTest {

    @Test
    public void RoomRunsCleanerTest() {
        try (Room myRoom = new Room(86)) {
            System.out.println("Goodbye");
        } catch (Exception ignored) {
            // Ignored
        }
    }
}