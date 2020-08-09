package edu.remad.chapter11.item78;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link StopThread}
 */
public class StopThreadTest {

    @Test
    public void testNoArgsConstructor() {
        assertDoesNotThrow(StopThread::new);
    }

    @Test
    public void testProcessStartAndStopThread() throws InterruptedException {
        StopThread thread = new StopThread();
        thread.processStartAndStopThread();

        TimeUnit.SECONDS.sleep(3);
        Thread.State actualState = thread.getState();

        assertEquals(Thread.State.TERMINATED, actualState);
    }
}