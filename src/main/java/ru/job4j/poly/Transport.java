package ru.job4j.poly;

public interface Transport {
    void ride();

    void passengers(int passengers);

    int price(int amount);
}
