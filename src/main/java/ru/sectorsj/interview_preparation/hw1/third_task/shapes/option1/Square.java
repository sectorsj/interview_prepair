package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option1;

public class Square extends Shape {
	String name;
	public Square(int width, int height, String name) {
		super(width, height);
		this.name = name;
	}
	
	@Override
	public void setColor(String color) {
		System.out.println("Квадрат раскрашен в " + color + " цвет");
	}
	
	@Override
	public void draw() {
		System.out.println("Квадрат нарисован");
	}
	
	@Override
	public void print() {
		System.out.println(name + ": "+ " высота = " + getHeight() + ", " + "ширина = " + getWidth());
	}
}
