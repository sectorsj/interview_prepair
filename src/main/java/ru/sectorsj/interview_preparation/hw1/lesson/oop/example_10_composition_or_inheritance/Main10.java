package ru.sectorsj.interview_preparation.hw1.lesson.oop.example_10_composition_or_inheritance;


public class Main10 {
    public static void main(String[] args) {
        Salary salary = new Salary(100f,"RU");
        Employee10 emp1 = new Employee10("Director", salary, "Artem", 30);

        float tempSalary = emp1.getSalary().getValue();

    }
}
