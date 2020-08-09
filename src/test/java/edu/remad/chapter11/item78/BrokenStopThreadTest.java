package edu.remad.chapter11.item78;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link BrokenStopThread}.
 */
public class BrokenStopThreadTest {

    @Test
    public void testNoArgsConstructor() {
        assertDoesNotThrow(BrokenStopThread::new);
    }

    @Test
    public void testStopRequestIsFalse() {
        BrokenStopThread brokenStopThread = new BrokenStopThread();

        assertFalse(brokenStopThread.isStopRequested());
    }

    @Test
    public void testProcessStartAndStopThreadAlive() throws InterruptedException {
        BrokenStopThread brokenStopThread = new BrokenStopThread();
        brokenStopThread.processStartAndStopThread();

        Thread.State runnable = Thread.currentThread().getState();

        assertTrue(Thread.currentThread().isAlive());
        assertEquals(Thread.State.RUNNABLE, runnable);
    }
}