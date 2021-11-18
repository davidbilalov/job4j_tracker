package ru.job4j.oop;

public class Dentist extends Doctor {
    private int tooth;

    public Dentist(String name, String surname, String education,
                   int birthday, String diagnosis, int tooth) {
        super(name, surname, education, birthday, diagnosis);
        this.tooth = tooth;
    }

    public int getTooth() {
        return tooth;
    }

}
