package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.quadrangle;

import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.Isoscelesable;
import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.Rectangularable;

public abstract class Trapezoid extends Quadrangle implements Isoscelesable, Rectangularable {

    public Trapezoid(String title) {
        super(title);
    }
}
