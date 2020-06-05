package edu.remad.chapter8.item50;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link RepairedImmutableConstructor}.
 */
public class RepairedImmutableConstructorTest {

    private final static ZoneId ZONE_ID = ZoneId.systemDefault();
    private final static Date START = new Date();
    private final static Date END = new Date();

    @Test
    public void constructorRunTest() throws IllegalArgumentException {
        RepairedImmutableConstructor period = new RepairedImmutableConstructor(START, END);
        assertNotNull(period);
    }

    @Test
    public void constructorThrowIllegalArgumentExceptionWhenStartIsNullTest() {
        assertThrows(IllegalArgumentException.class, () -> new RepairedImmutableConstructor(null, END));
    }

    @Test
    public void constructorThrowIllegalArgumentExceptionWhenEndIsNullTest() {
        assertThrows(IllegalArgumentException.class, () -> new RepairedImmutableConstructor(START, null));
    }

    @Test
    public void constructorThrowIllegalArgumentExceptionWhenStartIsAfterEndTest() {
        Date startAfterEnd = Date.from(LocalDate.of(2020, 10, 19).atStartOfDay(ZONE_ID).toInstant());
        Date endDate = Date.from(LocalDate.of(2020, 4, 4).atStartOfDay(ZONE_ID).toInstant());
        assertThrows(IllegalArgumentException.class, () -> new RepairedImmutableConstructor(startAfterEnd, endDate));
    }

    @Test
    void startEqualsSTARTTest() {
        RepairedImmutableConstructor period = new RepairedImmutableConstructor(START, END);
        assertEquals(START, period.start());
    }

    @Test
    void endEqualsENDTest() {
        RepairedImmutableConstructor period = new RepairedImmutableConstructor(START, END);
        assertEquals(END, period.end());
    }

}