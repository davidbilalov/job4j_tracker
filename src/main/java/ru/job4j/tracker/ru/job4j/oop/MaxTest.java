package ru.job4j.tracker.ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        double first = 1;
        double second = 2;
        double two = Max.max(first, second);
        double expected = 2;
        Assert.assertEquals(two, expected, 0.001);
    }

    @Test
    public void whenMax1To2Then3() {
        double first = 1;
        double second = 2;
        double third = 3;
        double three = Max.max(first, second, third);
        double expected = 3;
        Assert.assertEquals(three, expected, 0.001);
    }

    @Test
    public void whenMax1To2Then4() {
        double first = 1;
        double second = 2;
        double third = 3;
        double four = 4;
        double fourth = Max.max(first, second, third, four);
        double expected = 4;
       Assert.assertEquals(fourth, expected, 0.001);
    }
}