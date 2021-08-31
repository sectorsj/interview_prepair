package ru.sectorsj.interview_preparation.classworks.lesson1.oop.example_10_composition_or_inheritance;

public class Salary {
    float value;
    String currency;

    public Salary(float value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public float getValue() {
        return value;
    }

}
