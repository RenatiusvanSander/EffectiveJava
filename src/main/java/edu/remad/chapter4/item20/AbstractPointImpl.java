package edu.remad.chapter4.item20;

import java.awt.Point;

/**
 * @author Remy Meier
 */
public class AbstractPointImpl extends AbstractPoint {

    /**
     * Standard constructor.
     */
    public AbstractPointImpl() {
    }

    /**
     * Creates new instance of AbstractPointImpl.
     * @param point The point {@see java.awt.Point}.
     */
    public AbstractPointImpl(Point point) {
        this.setPoint(point);
    }

    /**
     * Creates new instance of AbstractPointImpl.
     * @param val1 The X value of the point.
     * @param val2 The Y value of the point.
     */
    public AbstractPointImpl(double val1, double val2) {
        Point point = new Point();
        point.setLocation(val1, val2);
        this.setPoint(point);
    }
}
