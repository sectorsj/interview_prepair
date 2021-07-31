package ru.sectorsj.interview_preparation.hw1.second_task.mistakes;

public class  Engine {
	private String model;
	private String serialNumber;
	private int power;
	
	public Engine(String model, String serialNumber, int power) {
		this.model = model;
		this.serialNumber = serialNumber;
		this.power = power;
	}
	
	@Override
	public String toString() {
		return "model='" + model + '\'' +
				", serialNumber='" + serialNumber + '\'' +
				", power=" + power +
				'}';
	}
}
