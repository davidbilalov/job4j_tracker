package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleancode = new Book();
        cleancode.setName("Clean code");

        Book sun = new Book();
        sun.setName("Sun");

        Book moon = new Book();
        moon.setName("Moon");

        Book star = new Book();
        star.setName("Star");

        Book[] array = new Book[4];
        array[0] = sun;
        array[1] = moon;
        array[2] = star;
        array[3] = cleancode;

        for (Book book : array) {
            System.out.println(book.getName());
        }
        Book temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        System.out.println();
        for (Book book : array) {
            System.out.println(book.getName());
        }
        System.out.println();
        for (Book book : array) {
            if (book.getName().equals(cleancode.getName())) {
                System.out.println(cleancode.getName());
            }
        }
    }
}
