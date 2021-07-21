package ru.job4j.tracker.ru.job4j.oop;

public class Profession {
    private String name;

    private String surname;

    private String education;

    private int birthday;
    public Profession() {

    }
    public Profession(String name) {
        this.name = name;
    }
    public Profession(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public Profession(String name, String surname, String education) {
        this.name = name;
        this.surname = surname;
        this.education = education;
    }
    public Profession(String name, String surname, String education,int birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }
}
