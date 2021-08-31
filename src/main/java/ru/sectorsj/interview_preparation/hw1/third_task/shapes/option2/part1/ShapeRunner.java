package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part1;

import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part1.circle.CircleImpl;

public class ShapeRunner {
	public static void main(String[] args) {
		CircleImpl redCircle = new CircleImpl("круг", 10, "красный");
		redCircle.setColor("красного");
		redCircle.draw();
		redCircle.setRadius(20);
		redCircle.draw();
		redCircle.setRadius(150);
		redCircle.draw();
	}
}
