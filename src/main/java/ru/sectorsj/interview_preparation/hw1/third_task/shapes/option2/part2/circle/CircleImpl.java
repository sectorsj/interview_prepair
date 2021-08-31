package ru.sectorsj.interview_preparation.hw1.third_task.shapes.option2.part2.circle;

public class CircleImpl extends Ellips {
    private double radius;
    private double circleArea;
    private double circleLenght;
    private double diameter;
    private final double PI = Math.PI;

    public CircleImpl(String title, String color, int radius, int circleArea, int circleLenght, int diameter) {
        super(title, color);
        this.radius = radius;
        this.circleArea = circleArea;
        this.circleLenght = circleLenght;
        this.diameter = diameter;
    }

    public CircleImpl(String title, int radius, int circleArea, int circleLenght, int diameter) {
        super(title);
        this.radius = radius;
        this.circleArea = circleArea;
        this.circleLenght = circleLenght;
        this.diameter = diameter;
    }

    public CircleImpl(String title, String color, int radius) {
        super(title, color);
        this.radius = radius;
    }

    public CircleImpl(String title, int radius) {
        super(title);
        this.radius = radius;
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
        System.out.printf(print() + " нарисован \n");
    }

    @Override
    public void move() {
    }

    @Override
    public String print() {
        String str = super.getTitle() + " " + color + " цвета " + "с радиусом " + radius;
        return str;
    }

    public void calculateCircleArea(double radius) {
        circleArea = PI * (Math.pow(radius, 2));
        System.out.println(String.format("площадь " + getTitle() + "a" + " по радиусу " + radius + " составляет" + " " + "%.2f", circleArea));
    }

    public void calculateCircleRadiusfromArea(double circleArea) {
        radius = Math.sqrt(circleArea / PI);
        System.out.println(String.format("радиус " + getTitle() + "a" + " по площади " + circleArea + " составляет" + " " +"%.2f", radius));
    }

    public void calculateCircleLength(double radius) {
        circleLenght = (2 * PI) * radius;
        System.out.println(String.format("длинна " + getTitle() + "a" + " при его радиусе " + radius + " составляет" + " " + "%.2f", circleLenght));
    }

    public void calculateRadiusFromCircleLenght(double circleLenght) {
        radius = circleLenght / (2 * PI);
        System.out.println(String.format("радиус " + getTitle() + "a" + " при его длинне " + circleLenght + " составляет" + " " + "%.2f", radius));
    }
}
