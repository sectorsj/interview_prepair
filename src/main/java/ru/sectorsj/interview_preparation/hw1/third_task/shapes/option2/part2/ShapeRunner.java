package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2;

import ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.circle.CircleImpl;

public class ShapeRunner {
	public static void main(String[] args) {
		CircleImpl redCircle = new CircleImpl("круг", 20);
		redCircle.setColor("красного");
		redCircle.draw();
		redCircle.calculateCircleRadiusfromArea(1256.66);
		redCircle.calculateCircleArea(20);
		redCircle.calculateCircleLength(20);
		redCircle.calculateRadiusFromCircleLenght(125.66);

	}
}
