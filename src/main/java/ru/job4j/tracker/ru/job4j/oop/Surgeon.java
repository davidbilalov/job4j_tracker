package ru.job4j.tracker.ru.job4j.oop;

public class Surgeon extends Doctor {
    private int operation;  // количество операций

    public Surgeon(String name, String surname, String education, int birthday,
                   String diagnosis, int operation) {
        super(name, surname, education, birthday, diagnosis);
        this.operation = operation;
    }

}
