package ru.job4j.tracker.ru.job4j.oop;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array;  //  даем понять компилятору где поле класса  и где локальная переменная
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}