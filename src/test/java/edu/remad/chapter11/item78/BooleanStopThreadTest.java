package edu.remad.chapter11.item78;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link BooleanStopThread}.
 */
public class BooleanStopThreadTest {

    @Test
    public void testNoArgsConstructor() {
        assertDoesNotThrow(BooleanStopThread::new);
    }

    @Test
    public void testProcessStartAndStopRun() throws InterruptedException {
        BooleanStopThread booleanStopThread = new BooleanStopThread();

        assertDoesNotThrow(booleanStopThread::processStartAndStop);
    }

    @Test
    public  void testInternalThreadHasStateTerminated() throws InterruptedException {
        BooleanStopThread booleanStopThread = new BooleanStopThread();
        booleanStopThread.processStartAndStop();

        Thread.State currentState = booleanStopThread.getState();
        currentState = booleanStopThread.getState();

        assertEquals(Thread.State.TERMINATED, currentState);
    }
}