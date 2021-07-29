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
        System.out.println(Arrays.toString(tracker.findAll()));
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
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);

            } else if (select == 4) {
                StartUI.findItemByID(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

            private void showMenu () {
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

            public static void main (String[]args){
                Input input = new ConsoleInput();
                Tracker tracker = new Tracker();
                UserAction[] actions = {
                        new CreateAction(), new DeleteAction(), new ReplaceAction()
                };
                new StartUI().init(input, tracker, actions);
            }
        }

