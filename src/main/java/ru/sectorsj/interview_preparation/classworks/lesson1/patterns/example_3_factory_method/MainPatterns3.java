package ru.sectorsj.interview_preparation.classworks.lesson1.patterns.example_3_factory_method;

public class MainPatterns3 {
    public static void main(String[] args) {
        Car3 toyota = CarFactory3.makeCare(30, "blue", new Engine3());
        Car3 volvo = CarFactory3.makeCare(50, "red", new Engine3());
    }
}
