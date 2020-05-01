package edu.remad.chapter4.item23;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.*;

public class InheritableFigureTest {

    private double length;
    private double width;

    @BeforeEach
    void setUp() {
        length = 6.23;
        width = 3.98;
    }

    @Test
    public void circleAreaEqualTest() {
        double radius = 68.93;
        double expectedArea = radius * radius * PI;

        Circle circle = new Circle(radius);

        assertEquals(expectedArea, circle.area());
    }

    @Test
    public void rectangleAreaEqualTest() {
        double expectedArea = length * width;

        Rectangle rectangle = new Rectangle(length, width);

        assertEquals(expectedArea, rectangle.area());
    }

    @Test
    public void squareAreaEqualTest() {
        double expectedArea = length * length;

        Square square = new Square(length);

        assertEquals(expectedArea, square.area());
    }
}