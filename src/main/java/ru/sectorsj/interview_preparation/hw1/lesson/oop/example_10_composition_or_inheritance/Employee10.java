package ru.sectorsj.interview_preparation.hw1.lesson.oop.example_10_composition_or_inheritance;

public class Employee10 extends Person10 {
    String post;
    Salary salary;

    public Employee10(String post, Salary salary, String name, int age) {
        super(name, age);
        this.post = post;
        this.salary = this.salary;
    }


    public String getPost() {
        return post;
    }

    public Salary getSalary() {
        return salary;
    }
}
