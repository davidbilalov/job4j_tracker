package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("Ride");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Passengers" + passengers);
    }

    @Override
    public int price(int amount) {
        return amount * 3;
    }
}
