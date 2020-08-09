package edu.remad.chapter11.item78;

import java.util.concurrent.TimeUnit;

/**
 * Demonstrates a broken stop of a thread.
 */
public class BrokenStopThread {

    /**
     * Creates new instance of {@link BrokenStopThread}
     */
    public BrokenStopThread() {
        this.init();
    }

    /**
     * Initializes privates
     */
    private void init() {
        stopRequested = false;
    }

    /**
     * @return In case stop is requested {@code true}. If not requested {@code false}.
     */
    public boolean isStopRequested() {
        return stopRequested;
    }

    /**
     * Processes start and stop of this Thread.
     */
    public void processStartAndStopThread() throws InterruptedException{
        Thread brokenThread = new Thread(() -> {
            int i = 0;
            while(!stopRequested){
                i++;
            }
        });
        brokenThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }

    /**
     * stops a requested
     */
    private boolean stopRequested;
}
