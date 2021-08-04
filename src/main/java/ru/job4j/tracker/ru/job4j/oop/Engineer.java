package ru.job4j.tracker.ru.job4j.oop;

public class Engineer extends Profession {
    private String myFantasyIsOver;

    public String getMyFantasyIsOver() {
        return myFantasyIsOver;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getBirthday() {
        return super.getBirthday();
    }

    @Override
    public String getEducation() {
        return super.getEducation();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }
}
