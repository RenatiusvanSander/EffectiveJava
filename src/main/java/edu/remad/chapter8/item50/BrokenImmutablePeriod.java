package edu.remad.chapter8.item50;

import java.util.Date;

public final class BrokenImmutablePeriod {

    private final Date start;
    private final Date end;

    /**
     * Creates a broken immutable of Period.
     * @param start The beginning of the period.
     * @param end The end of the period, has to be bigger than start.
     */
    public BrokenImmutablePeriod(Date start, Date end) {
        if(start == null || end == null || start.compareTo(end) > 0) {
            // Throws IllegalArgumentException when start or end or start is bigger compared to end.
            throw new IllegalArgumentException(start + " after " + end);
        }
        this.start = start;
        this.end = end;
    }

    /**
     * @return Returns start of period.
     */
    public Date start() {
        return start;
    }

    /**
     * @return Returns ending of period
     */
    public Date end() {
        return end;
    }
}
