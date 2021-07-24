package ru.job4j.tracker;

import  java.util.Arrays;
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        int count  = 0;
        Item[] list = new Item[size];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                list[count] = item;
                count++;
            }
        }
        Item[] listreturn =  Arrays.copyOf(list, count);

        return listreturn;
    }

    public Item[] findAll() {
        int count = 0;
        Item[] list = new Item[size];
        for (int index = 0; index < size; index++) {
            if (!(items[index].equals(null))) {
                list[count] = items[index];
                count++;
            }
        }
        Item[] listReturn = Arrays.copyOf(list, count);
        return listReturn;
    }
//    получение списка всех заявок - public Item[] findAll();
//    получение списка по имени - public Item[] findByName(String key);
//    получение заявки по id - public Item findById(int id);
}