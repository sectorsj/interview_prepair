package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.circle;

public class OvalImpl extends Ellips {

	/**
	 *  a - большая полуось
	 *  b - малая полуось
	 *  c - фокальное расстояние (полурасстояние между фокусами)
	 *  p - фокальный параметр
	 *  p - перифокусное расстояние (минимальное расстояние от фокуса до точки на эллипсе)
	 *   -  пофокусное расстояние максимальное расстояние от фокуса до точки на эллипсе)
	 */

	private int semiMajorAxis;
	private int semiMinorAxis;
	private int focalDistance;
	private int focalParameter;
	private int peripheralDistance;
	private int apofocalDistance;

	public OvalImpl(String title, String color, int semiMajorAxis, int semiMinorAxis, int focalDistance, int focalParameter, int peripheralDistance, int apofocalDistance) {
		super(title, color);
		this.semiMajorAxis = semiMajorAxis;
		this.semiMinorAxis = semiMinorAxis;
		this.focalDistance = focalDistance;
		this.focalParameter = focalParameter;
		this.peripheralDistance = peripheralDistance;
		this.apofocalDistance = apofocalDistance;
	}

	@Override
	public void setColor(String color) {

	}

	@Override
	public void changeColor(String color) {

	}

	@Override
	public void draw() {

	}

	@Override
	public void move() {

	}

	@Override
	public String print() {

		return null;
	}
}
