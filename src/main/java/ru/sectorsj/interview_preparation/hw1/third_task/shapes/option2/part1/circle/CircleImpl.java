package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part1.circle;

public class CircleImpl implements Ellips {
	
	String title;
	int radius;
	String color;
	
	public CircleImpl(String title, int radius, String color) {
		this.title = title;
		this.radius = radius;
		this.color = color;
	}
	
	public CircleImpl(String title, int radius) {
		this.title = title;
		this.radius = radius;
	}

	public CircleImpl(String title) {
		this.title = title;
	}

	public CircleImpl() {
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void changeColor(String color) {

	}

	@Override
	public void draw() {
		System.out.println(title + " " + color + " с радиусом "+ radius + " нарисован");
	}
	
	@Override
	public void move() {

	}
	
	@Override
	public void print() {

	}

	@Override
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
