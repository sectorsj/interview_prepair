package ru.sectorsj.interview_preparation.hw1.lesson.patterns.example_3_factory_method;

public class CarFactory3 {

    public static Car3 makeCare(int speed, String color, Engine3 engine3) {
        return new Car3(speed, color, engine3);
    }
}
