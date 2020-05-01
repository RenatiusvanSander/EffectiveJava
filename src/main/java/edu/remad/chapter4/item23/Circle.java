package edu.remad.chapter4.item23;

import static java.lang.Math.*;

class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return PI * (radius * radius);
    }
}
