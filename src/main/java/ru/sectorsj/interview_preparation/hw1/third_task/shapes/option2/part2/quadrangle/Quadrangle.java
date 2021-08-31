package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.quadrangle;

import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.Shape2;
import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.Corractable;
import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.Equilateralable;
import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.Versatileable;

public abstract class Quadrangle extends Shape2 implements Corractable, Equilateralable, Versatileable {

    public Quadrangle(String title) {
        super(title);
    }
}
