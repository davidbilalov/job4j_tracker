package ru.job4j.tracker;

public class ReplaceAction implements UserAction{
    @Override
    public String name() {
        return "Replace item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit an item ===" + System.lineSeparator());
        int id = Integer.parseInt(input.askStr("Enter ID: "));
        System.out.println();
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.replace(id, item);
        return true;
    }
}
