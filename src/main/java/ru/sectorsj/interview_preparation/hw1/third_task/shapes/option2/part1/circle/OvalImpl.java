package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part1.circle;

public class OvalImpl implements Ellips {

	String title;
	int radius;

	public OvalImpl(String title, int radius) {
		this.title = title;
		this.radius = radius;
	}

	public OvalImpl() {
	}

	@Override
	public void setColor(String color) {
		System.out.println(title + " " + color + " цвета");
	}

	@Override
	public void changeColor(String color) {

	}

	@Override
	public void draw() {
		System.out.println(title + "с радиусом "+ radius + " нарисован");
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
		System.out.println(title + " " + radius);
	}
}
