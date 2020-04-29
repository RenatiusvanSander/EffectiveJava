package edu.remad.chapter4.item20;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.awt.Point;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AbstractPointImplTest {

    private double x;
    private double y;
    private Point point;

    @BeforeEach
    void setUp() {
        x = 4;
        y = 5;
        point = new Point((int) x, (int) y);
    }

    @AfterEach
    void tearDown() {
        point = null;
    }

    @Test
    public void secondConstructorCreateCorrectInstanceTest() {
        AbstractPointImpl apImpl = new AbstractPointImpl(point);

        assertThat(apImpl.getPoint(), equalTo(point));
    }

    @Test
    public void thirdConstructorCreateCorrectInstanceTest() {
        double doubleX = 4.45;
        double doubleY = 7.25;
        Point expectedPoint = new Point();
        expectedPoint.setLocation(doubleX, doubleY);

        AbstractPointImpl apImpl = new AbstractPointImpl(doubleX, doubleY);

        assertThat(apImpl.getPoint(), equalTo(expectedPoint));
    }

    @Test
    public void setXSetCorrectValueTest() {
        AbstractPointImpl apImpl = new AbstractPointImpl();
        apImpl.setX(6.45);

        assertThat(apImpl.getX(), equalTo(6.0));
    }

    @Test
    public void setYSetCorrectValueTest() {
        AbstractPointImpl apImpl = new AbstractPointImpl();
        apImpl.setY(6.45);

        assertThat(apImpl.getY(), equalTo(6.0));
    }
}