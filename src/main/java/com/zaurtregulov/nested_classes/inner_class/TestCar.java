package com.zaurtregulov.nested_classes.inner_class;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        Car.Engine engine3 = new Car("yellow", 4).new Engine(200);

//        Car.Engine engine2 = new car.Engine(150);
    }
}
