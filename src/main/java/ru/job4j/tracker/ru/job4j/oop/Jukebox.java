package ru.job4j.tracker.ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
//        if (position == 1) {
//            System.out.println("Пусть бегут неуклюже");
//        }
//        if (position == 2) {
//            System.out.println("Спокойной ночи");
//        }
//        if (position == 3) {
//            System.out.println("Песня не найдена");
//        }
        System.out.println((position == 1) ? "Пусть бегут неуклюже": (position == 2) ? "Спокойной ночи": "Песня не найдена" );
    }

    public static void main(String[] args) {
        Jukebox pos = new Jukebox();
        pos.music(1);
    }
}
