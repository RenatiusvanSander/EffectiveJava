package edu.remad.chapter11.item78;

import java.util.concurrent.TimeUnit;

/**
 * Stops a thread properly cooperative synchronized.
 */
public class StopThread {

    /**
     * Creates new instance of {@link StopThread}
     */
    public StopThread() {
        init();
    }

    /**
     * @return The current {@link Thread.State state} of internal thread
     */
    public Thread.State getState() {
        return state;
    }

    /**
     * Processes start and stop of this class.
     */
    public void processStartAndStopThread() throws InterruptedException {
        Thread thread = new Thread(() -> {
            this.setState(Thread.State.RUNNABLE);

            int i = 0;

            while (!isStopRequested()) {
                i++;
            }

            this.setState(Thread.State.TERMINATED);
        });
        thread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }

    /**
     * Initializes private varies.
     */
    private void init() {
        this.stopRequested = false;
    }

    /**
     * Requests stop of thread.
     */
    private synchronized void requestStop() {
        stopRequested = true;
    }

    /**
     * @return In case of stop is requested {@code true}. If not {@code false}.
     */
    private synchronized boolean isStopRequested() {
        return stopRequested;
    }

    /**
     * Sets state of internal thread.
     *
     * @param stateVal The current state of internal thread
     */
    private void setState(Thread.State stateVal) {
        state = stateVal;
    }

    /**
     * boolean for stop requests
     */
    private boolean stopRequested;
    /**
     * state of internal used thread
     */
    private Thread.State state;
}
