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

        for(int index = 0; index < array.length; index++) {
            Book book = array[index];
            System.out.println(book.getName());
        }
        Book temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        System.out.println();
        for(int index = 0; index < array.length; index++) {
            Book book = array[index];
            System.out.println(book.getName());
        }
        System.out.println();
        for (int index = 0; index < array.length; index++) {
            if(array[index] == cleancode) {
                System.out.println(cleancode.getName());
            }
        }
    }
}
