package ru.job4j.tracker;

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
        return null;
    }

    public Item[] findAll() {
        return null;
    }
//    получение списка всех заявок - public Item[] findAll();
//    получение списка по имени - public Item[] findByName(String key);
//    получение заявки по id - public Item findById(int id);
}