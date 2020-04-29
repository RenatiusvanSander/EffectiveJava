package edu.remad.chapter4.item20;

/**
 * Point defines the methods of a Point.
 */
public interface Point {

    /**
     * @return The x value of the {@link java.awt.Point}
     */
    double getX();

    /**
     * Sets X value.
     * @param xVal The x value of the {@link java.awt.Point}
     */
    void setX(double xVal);

    /**
     * @return The y value of the {@link java.awt.Point}
     */
    double getY();

    /**
     * Sets Y value.
     * @param yVal The y value of the {@link java.awt.Point}
     */
    void setY(double yVal);

    /**
     * @return the point {@link java.awt.Point}
     */
    java.awt.Point getPoint();

    /**
     * Sets the point
     * @param point The point {@link java.awt.Point}.
     */
    void setPoint(java.awt.Point point);
}
