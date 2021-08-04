package ru.job4j.tracker;



public class ConsoleInput implements Input {
    private Input input = new Input() {
        @Override
        public String askStr(String question) {
            return null;
        }

        @Override
        public int askInt(String question) {
            return 0;
        }
    };

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return input.askStr(question);
    }

    @Override
    public int askInt(String question) {
        return input.askInt(question);
    }
}
