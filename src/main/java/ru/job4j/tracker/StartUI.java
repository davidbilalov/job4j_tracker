package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void findAllItems(Input input, Tracker tracker) {
        System.out.println("=== Showing all items ===" + System.lineSeparator());
        tracker.findAll();
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit an item ===" + System.lineSeparator());
        int id = Integer.parseInt(input.askStr("Enter ID to replace: "));
        System.out.println();
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.replace(id, item);
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete an item ===" + System.lineSeparator());
        int id = Integer.parseInt(input.askStr("Enter item's ID: "));
        tracker.delete(id);
    }

    public static void findItemByID(Input input, Tracker tracker) {
        System.out.println("=== Find an item by ID ===" + System.lineSeparator());
        int id = Integer.parseInt(input.askStr("Enter ID: "));
        tracker.findById(id);
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find an item by Name ===" + System.lineSeparator());
        String name = input.askStr("Enter name: ");
        tracker.findByName(name);
    }
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
