package ru.job4j.tracker.ru.job4j.oop;

public class Student {
    public void song() {
        System.out.println("I believe I can fly");
    }
    public void music() {
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        Student david = new Student();
        david.song();
        david.song();
        david.song();
        david.music();
        david.music();
        david.music();

    }
}
