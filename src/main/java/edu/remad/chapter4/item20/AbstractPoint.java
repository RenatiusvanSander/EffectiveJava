package edu.remad.chapter4.item20;

import java.awt.Point;

/**
 * This class presents how AbstractInterface is used.
 */
public abstract class AbstractPoint implements edu.remad.chapter4.item20.Point {

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public void setX(double xVal) {
        point.setLocation(xVal, point.getY());
    }

    @Override
    public double getY() {
        return point.getY();
    }

    @Override
    public void setY(double yVal) {
        point.setLocation(point.getX(), yVal);
    }

    @Override
    public Point getPoint() {
        return point;
    }

    @Override
    public void setPoint(Point point) {
        this.point = point;
    }

    private Point point = new Point();
}
