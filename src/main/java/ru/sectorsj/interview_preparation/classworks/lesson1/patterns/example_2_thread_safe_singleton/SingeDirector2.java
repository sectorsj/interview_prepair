package ru.sectorsj.interview_preparation.classworks.lesson1.patterns.example_2_thread_safe_singleton;

class SingeDirector2 {
    private  static Director2 instance;

    private SingeDirector2() {}

    public static Director2 getInstance() {
        if (instance == null) {
            synchronized (Director2.class) {
                if (instance == null) {
                    instance = new Director2();
                }
            }
        }
        return instance;
    }
}
