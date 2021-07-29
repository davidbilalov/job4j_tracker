package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        if (key == null) {
            throw new ElementNotFoundException("Element not found.");
        }
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] str = new String[]{"d", "b", "c"};
        try {
            indexOf(str, null);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}