package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option1;

public class ShapeRunner {
	public static void main(String[] args) {
		
		Shape greenCircle = new Circle(20);
		greenCircle.draw();
		greenCircle.setColor("зеленый");
		greenCircle.print();
		
		Shape radTriangle = new Triangle(100, 100);
		radTriangle.draw();
		radTriangle.setColor("красный");
		System.out.println(radTriangle.getHeight());
		radTriangle.print();
		
		Shape blueSquare = new Square(200, 200, "Квадрат");
		blueSquare.draw();
		blueSquare.setColor("синий");
		blueSquare.print();
	}
}
