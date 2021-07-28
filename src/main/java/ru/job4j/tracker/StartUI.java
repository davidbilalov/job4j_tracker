package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replace(Input input, Tracker tracker) {
        int id = Integer.parseInt(input.askStr("=== Edit item ===="));
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item item = new Item(name);
    }

    public static void delete(Input input) {
        int id = input.askInt("");
    }

    public void init(Input input, Tracker tracker) {
            boolean run = true;
            while (run) {
                this.showMenu();
                int select = input.askInt("Select: ");
                if (select == 0) {
                    StartUI.createItem(input, tracker);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Хранилище еще не содержит заявок");
                }
            }  else if (select == 2) {
                StartUI.replace(input, tracker);
            } else if (select == 3) {
                    StartUI.delete(input);

            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                System.out.print("Enter id: ");
                int id = input.askInt("");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка с введенным id: " + id + " не найдена.");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                System.out.print("Enter name: ");
                String name = input.askStr("");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с именем: " + name + " не найдены.");
                }
            } else if (select == 6) {
                    run = false;
                }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);

    }
}
