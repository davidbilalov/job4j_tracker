package ru.job4j.poly;

public class TransportMain {
    public static void main(String[] args) {
        Vehicle airBus = new AirBus();
        Vehicle train = new Train();
        Vehicle airplane = new Airplane();

        Vehicle[] vehicles = new Vehicle[] {airBus, train, airplane};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
