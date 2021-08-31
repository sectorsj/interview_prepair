package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option1;

public class Triangle extends Shape{

	public Triangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void setColor(String color) {
		System.out.println("Треугольник раскрашен в " + color + " цвет");
	}
	
	@Override
	public void draw() {
		System.out.println("Треугольник нарисован");
	}
	
	@Override
	public void print() {
		System.out.println("Треугольник: высота = " + getHeight() + ", " + "ширина = " + getWidth());
	}
}
