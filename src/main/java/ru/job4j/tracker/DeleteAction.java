package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete an item ===" + System.lineSeparator());
        int id = Integer.parseInt(input.askStr("Enter item's ID: "));
        tracker.delete(id);
        return true;
    }
}
