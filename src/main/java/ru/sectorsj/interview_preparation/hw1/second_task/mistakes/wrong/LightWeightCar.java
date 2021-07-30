package ru.sectorsj.interview_preparation.hw1.second_task.mistakes.wrong;

public class LightWeightCar extends Car implements Movable {

	@Override
	void open() {
		System.out.println("Car is open");
	}

	@Override
	public void move() {
		System.out.println("Car is moving");
	}
}
