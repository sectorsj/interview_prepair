package ru.sectorsj.interview_preparation.hw1.lesson.patterns.example_3_factory_method;

public class Car3 implements Movable3 {
    int speed;
    String color;
    Engine3 engine3;


    public Car3(int speed, String color, Engine3 engine3) {
        this.speed = speed;
        this.color = color;
        this.engine3 = engine3;
    }

    @Override
    public void start() {
        while (speed < 50) {
            speed++;
        }
    }

    @Override
    public void stop() {
        while (speed > 0) {
            speed--;
        }
    }
}
