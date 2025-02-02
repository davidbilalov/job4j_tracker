package ru.job4j.tracker;

public class FindAllItemAction implements UserAction {
    private Output out;

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}