package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.triangle;

import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.Shape2;
import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.*;

public abstract class Triangle extends Shape2 implements Equilateralable, Versatileable, Isoscelesable, Rectangularable, Corractable, AcuteAngledable, Obtuseable {

    public Triangle(String title) {
        super(title);
    }
}
