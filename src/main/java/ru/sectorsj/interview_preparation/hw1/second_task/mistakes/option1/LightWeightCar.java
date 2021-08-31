package ru.sectorsj.interview_preparation.hw1.second_task.mistakes.option1;

public class LightWeightCar extends Car {
	
	public LightWeightCar(Engine engine, String color, String name) {
		super(engine, color, name);
	}
	
	@Override
	public void move() {
		System.out.println(getName() + " " + "is moving");
	}
	
	@Override
	public void stop() {
		System.out.println(getName() + " " + "is stoped");
	}
	
	@Override
	public void open() {
		System.out.println(getName() + " " + "is open");
	}
	
	@Override
	public void close() {
		System.out.println(getName() + " " + "is close");
	}
	
}
