package Homework3_2.task7;

public class GarbageTruck extends Car {

    public GarbageTruck(String name, String color, double maxSpeed, int countOfWheels, int countOfGears, int tankCapacityIsFull, int countOfDoors, int countOfPassengers) {
        super(name, color, maxSpeed, countOfWheels, countOfGears, tankCapacityIsFull, countOfDoors, countOfPassengers);
    }

    public void explainGarbageIntoFuel(int levelGasoline, int garbageCollected) {
        if (garbageCollected >= 20) {
            while (levelGasoline < getTankCapacityIsFull()) {
                garbageCollected =- 10;
                levelGasoline =+ 1;
            }
        }else {
            System.out.println("Not enough garbage, collect more");
        }
    }
    public void generalCharacteristic(){
        System.out.println("Vehicle " + getName());
        System.out.println("Color " + getColor());
        System.out.println("Maximum speed " + getMaxSpeed());
        System.out.println("Volume of the fuel tank " + getTankCapacityIsFull());
        System.out.println("Number of passenger seats " + getCountOfPassengers());
        System.out.println("Count of door "+getCountOfDoors());
        System.out.println("The car can recycle garbage into gasoline");
    }
}