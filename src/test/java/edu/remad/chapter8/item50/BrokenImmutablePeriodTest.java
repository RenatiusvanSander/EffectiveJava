package edu.remad.chapter8.item50;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link BrokenImmutablePeriod}.
 */
public class BrokenImmutablePeriodTest {

    private final static ZoneId ZONE_ID = ZoneId.systemDefault();
    private final static Date START = new Date();
    private final static Date END = new Date();

    @Test
    public void constructorRunTest() throws Exception {
        BrokenImmutablePeriod period = new BrokenImmutablePeriod(START, END);
        assertNotNull(period);
    }

    @Test
    public void constructorThrowIllegalArgumentExceptionWhenStartIsNullTest() {
        assertThrows(IllegalArgumentException.class, () -> new BrokenImmutablePeriod(null, END));
    }

    @Test
    public void constructorThrowIllegalArgumentExceptionWhenEndIsNullTest() {
        assertThrows(IllegalArgumentException.class, () -> new BrokenImmutablePeriod(START, null));
    }

    @Test
    public void constructorThrowIllegalArgumentExceptionWhenStartIsAfterEndTest() {
        Date startAfterEnd = Date.from(LocalDate.of(2020, 10, 19).atStartOfDay(ZONE_ID).toInstant());
        Date endDate = Date.from(LocalDate.of(2020, 4, 4).atStartOfDay(ZONE_ID).toInstant());
        assertThrows(IllegalArgumentException.class, () -> new BrokenImmutablePeriod(startAfterEnd, endDate));
    }

    @Test
    void startEqualsSTARTTest() {
        BrokenImmutablePeriod period = new BrokenImmutablePeriod(START, END);
        assertEquals(START, period.start());
    }

    @Test
    void endEqualsENDTest() {
        BrokenImmutablePeriod period = new BrokenImmutablePeriod(START, END);
        assertEquals(END, period.end());
    }
}