package ru.sectorsj.interview_preparation.classworks.lesson1.patterns.example_1_singleton;

class SingeDirector1 {
    private  static Director1 instance;

    private SingeDirector1() {
    }

    public static Director1 getInstance() {
        if (instance == null) {
            instance = new Director1();
        }
        return instance;
    }
}
