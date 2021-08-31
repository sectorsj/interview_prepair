package ru.sectorsj.interview_preparation.classworks.lesson1.oop.example_7_abstractclass_implements_interface;

public abstract class Person7 implements Movable7 {
    protected String name;
    protected int age;

    public Person7(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
