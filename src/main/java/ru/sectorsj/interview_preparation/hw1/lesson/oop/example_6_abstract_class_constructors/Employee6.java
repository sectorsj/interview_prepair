package ru.sectorsj.interview_preparation.hw1.lesson.oop.example_6_abstract_class_constructors;

public class Employee6 extends Person6{
    private float salary;

    public Employee6(float salary, String name, int age) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
