package ru.job4j.tracker.ru.job4j.oop;

public class Max {
    public static double add(double first, double second) {
        return first > second ? first : second;
    }

    public static double add(double first, double second, double third) {
        return add(
                first,
                add(second, third)
        );
    }

    public static double add(double first, double second, double third, double four) {
        return add(
                first,
                add(second, third, four)
        );
    }

}
