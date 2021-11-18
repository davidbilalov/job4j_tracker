package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void x3Toy4() {
        Point a = new Point(3, 0);
        Point b = new Point(0, 4);
        double two = a.distance(b);
        double expected = 5.0;
        Assert.assertEquals(expected, two, 0.001);
    }

    @Test
    public void xyz() {
        Point a = new Point(5, 4, 3);
        Point b = new Point(5, 7, 0);
        double doub = a.distance3d(b);
        double expected = 4.24;
        Assert.assertEquals(expected, doub,  0.1);
    }

}
