package edu.remad.chapter8.item50;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link FixedImmutablePeriodGetter}
 */
public class FixedImmutablePeriodGetterTest {

    private final static ZoneId ZONE_ID = ZoneId.systemDefault();
    private final static Date START = new Date();
    private final static Date END = new Date();

    @Test
    public void constructorRunTest() throws IllegalArgumentException {
        FixedImmutablePeriodGetter period = new FixedImmutablePeriodGetter(START, END);
        assertNotNull(period);
    }

    @Test
    public void constructorThrowIllegalArgumentExceptionWhenStartIsNullTest() {
        assertThrows(IllegalArgumentException.class, () -> new FixedImmutablePeriodGetter(null, END));
    }

    @Test
    public void constructorThrowIllegalArgumentExceptionWhenEndIsNullTest() {
        assertThrows(IllegalArgumentException.class, () -> new FixedImmutablePeriodGetter(START, null));
    }

    @Test
    public void constructorThrowIllegalArgumentExceptionWhenStartIsAfterEndTest() {
        Date startAfterEnd = Date.from(LocalDate.of(2020, 10, 19).atStartOfDay(ZONE_ID).toInstant());
        Date endDate = Date.from(LocalDate.of(2020, 4, 4).atStartOfDay(ZONE_ID).toInstant());
        assertThrows(IllegalArgumentException.class, () -> new FixedImmutablePeriodGetter(startAfterEnd, endDate));
    }

    @Test
    void startEqualsSTARTTest() {
        FixedImmutablePeriodGetter period = new FixedImmutablePeriodGetter(START, END);
        assertEquals(START, period.start());
    }

    @Test
    void endEqualsENDTest() {
        FixedImmutablePeriodGetter period = new FixedImmutablePeriodGetter(START, END);
        assertEquals(END, period.end());
    }
}