package com.zaurtregulov.nested_classes.static_nested_class;

public class TestCar {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red",2,engine);
        System.out.println(car);

    }
}
