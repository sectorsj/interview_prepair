package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option1;

public abstract class Shape implements Colorable, Drawable, Printable {
	
	private int width;
	private int height;
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Shape() {
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
