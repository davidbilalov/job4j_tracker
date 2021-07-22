package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleancode = new Book();
        Book sun = new Book();
        Book moon = new Book();
        Book star = new Book();
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
    }
}
