package ru.sectorsj.interview_preparation.hw1.second_task.mistakes;

public abstract class Car implements Movable, Openable {
	private Engine engine;
	private String color;
	private String name;
	
	public Car(Engine engine, String color, String name) {
		this.engine = engine;
		this.color = color;
		this.name = name;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void move() {
		System.out.println("LightWeightCar is moving");
	}
	
	@Override
	public void stop() {
		System.out.println("LightWeightCar is stoped");
	}
	
	@Override
	public void open() {
		System.out.println("LightWeightCar is open");
	}
	
	@Override
	public void close() {
		System.out.println("LightWeightCar is closed");
	}
	
	
	public String toString() {
		return "Car{" +
				"engine=" + engine +
				", color='" + color + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
