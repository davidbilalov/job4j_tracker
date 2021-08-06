package ru.job4j.tracker.ru.job4j.oop;

public class Engineer extends Profession {
    private String myFantasyIsOver;

    public Engineer(String name, String surname, String education,
                    int birthday, String myFantasyIsOver) {

        super(name, surname, education, birthday);
        this.myFantasyIsOver = myFantasyIsOver;
    }

    public String getMyFantasyIsOver() {
        return myFantasyIsOver;
    }

}
