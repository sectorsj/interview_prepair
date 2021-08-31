package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2;

import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.Colorable;
import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.Drawable;
import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.Moveable;
import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.properties.Printable;

public abstract class Shape2 implements Printable, Drawable, Moveable, Colorable {
    private String title;

    public Shape2(String title) {
        this.title = title;
    }

    public Shape2() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
