package org.example;


class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.speed = 230;
        car2.speed = 210;
        car1.number = 1;
        car2.number = 2;
        car1.run();
        car2.run();
    }
}
