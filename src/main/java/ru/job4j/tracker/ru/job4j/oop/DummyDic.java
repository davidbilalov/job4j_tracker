package ru.job4j.tracker.ru.job4j.oop;

public class DummyDic {
    public  String engToRus(String eng) {
        String str = ("Неизвестное слово. " + eng);
        return str;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String s = "qwerty";
        System.out.println(word.engToRus(s));
    }

}
