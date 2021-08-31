package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.circle;

import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.Shape2;

public abstract class Ellips extends Shape2 {
    protected String color;

    public Ellips(String title, String color) {
        super(title);
        this.color = color;
    }

    public Ellips(String title) {
        super(title);
    }


}
