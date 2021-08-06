package ru.job4j.tracker.ru.job4j.oop;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname,
                      String education, int birthday, String language, String myFantasyIsOver) {

        super(name, surname, education, birthday, myFantasyIsOver);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

}
