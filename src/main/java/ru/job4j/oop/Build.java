package ru.job4j.oop;

public class Build extends Engineer {
    private int build;

    public Build(String name, String surname, String education,
                 int birthday, String myFantasyIsOver, int build) {
        super(name, surname, education, birthday, myFantasyIsOver);
        this.build = build;
    }

    public int getBuild() {
        return build;
    }

}
