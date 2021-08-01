package ru.job4j.io;

import org.junit.Test;
import ru.job4j.ex.Fact;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        new Fact().calc(-1);
    }
}
