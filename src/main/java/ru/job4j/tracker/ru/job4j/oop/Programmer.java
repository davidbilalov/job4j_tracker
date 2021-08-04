package ru.job4j.tracker.ru.job4j.oop;

public class Programmer extends Engineer {
    private String language;

    public String getLanguage() {
        return language;
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

    @Override
    public String getMyFantasyIsOver() {
        return super.getMyFantasyIsOver();
    }
}
