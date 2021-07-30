package ru.sectorsj.interview_preparation.hw1.second_task.mistakes.wrong;

public class BuildCarRunner {
	public static void main(String[] args) {
		Director director = new Director();
		
		director.setBuilder(new LightWeightCar());
		Car car = director.buildCar();
		
		System.out.println(car);
	}
}
