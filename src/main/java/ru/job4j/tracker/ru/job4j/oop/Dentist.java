package ru.job4j.tracker.ru.job4j.oop;

public class Dentist extends Doctor{
    private int tooth;

    public int getTooth() {
        return tooth;
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
    public String heal() {
        return super.heal();
    }
}
