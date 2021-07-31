package ru.sectorsj.interview_preparation.hw1.second_task.mistakes;

public class MainRunner {
    
    
    public static void main(String[] args) {
        
        Car lightWeightCar = new LightWeightCar(new Engine("b16a", "R654-03-00021", 180), "blue", "Honda Civic");
        Car lorry = new Lorry(new Engine("5А-FE", "TR-3452-GV", 105), "red", "Toyota Corolla");
    
        System.out.println(lightWeightCar.toString());
        lightWeightCar.open();
        lightWeightCar.close();
        System.out.println(lorry);
        lorry.move();
        lorry.stop();
    }
}
