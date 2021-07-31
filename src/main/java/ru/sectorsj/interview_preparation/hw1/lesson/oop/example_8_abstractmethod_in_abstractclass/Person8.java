package ru.sectorsj.interview_preparation.hw1.lesson.oop.example_8_abstractmethod_in_abstractclass;

public abstract class Person8 {
    protected String name;
    protected int age;

    public void goJava() {
        System.out.println("Go Java Go!!");
    }

    public void stopJava() {
        System.out.println("Java stop");
    }

    /**
     *  Скомпилируется, так как абстрактные классы не обязаны содержать абстрактные методы.
     *  Компилятор сделает все необходимые преобразования и запретит создавать экземпляры такого класса.
     *  А вот нужны ли подобные классы — вопрос.
     */


}
