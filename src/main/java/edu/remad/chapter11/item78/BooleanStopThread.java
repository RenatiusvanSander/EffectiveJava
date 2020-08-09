package edu.remad.chapter11.item78;

import java.util.concurrent.TimeUnit;

/**
 * Boolean stops the internal thread.
 */
public class BooleanStopThread {

    /**
     * Creates a new instance of {@code BooleanStopThread}.
     */
    public BooleanStopThread() {
        init();
    }

    /**
     * @return current {@link Thread.State state} of internal thread.
     */
    public Thread.State getState() {
        return state;
    }

    /**
     * @throws InterruptedException In case internal thread is interrupted is {@code InterruptedException}.
     */
    public void processStartAndStop() throws InterruptedException {
        Thread internalThread = new Thread(() -> {
            this.state = Thread.State.RUNNABLE;
            int i = 0;

            while (!stopRequested) {
                i++;
            }

            this.state = Thread.State.TERMINATED;
        });
        internalThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;

        TimeUnit.SECONDS.sleep(2);
    }

    /**
     * Initializes stopRequested to {@code false}.
     */
    private void init() {
        stopRequested = false;
    }

    /**
     * stop requested stops a running thread
     */
    private volatile boolean stopRequested;
    /** current state of internal thread when processStartAndStop runs */
    private Thread.State state;
}
