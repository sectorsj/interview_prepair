package ru.sectorsj.interview_preparation.hw1.second_task.mistakes.wrong;

public class Lorry extends Car, Movable, Stopable {

	@Override
	public void move() {
		System.out.println("LightWeightCar is moving");
	}

	@Override
	public void stop() {
		System.out.println("LightWeightCar is stopped");
	}
}
