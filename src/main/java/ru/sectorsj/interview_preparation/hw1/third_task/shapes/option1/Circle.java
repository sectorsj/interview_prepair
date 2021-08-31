package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option1;

public class Circle extends BaseCircle {
	private final int radius;
	
	public Circle(int width, int height, int radius) {
		super(width, height);
		this.radius = radius;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	@Override
	public void setColor(String color) {
		System.out.println("Круг раскрашен в " + color + " цвет");
	}
	
	@Override
	public void draw() {
		System.out.println("Круг нарисован");
	}
	
	@Override
	public void print() {
		System.out.println("Радиус круга: " + getRadius());
	}

	@Override
	public void calculeteRadius() {

	}
}
