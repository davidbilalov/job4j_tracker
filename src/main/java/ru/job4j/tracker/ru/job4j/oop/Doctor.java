package ru.job4j.tracker.ru.job4j.oop;

public class Doctor extends  Profession{
    private String diagnosis;

    public String heal() {
        return diagnosis;
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
