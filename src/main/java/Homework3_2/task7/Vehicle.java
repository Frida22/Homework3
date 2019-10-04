package Homework3_2.task7;

public class Vehicle {
    private String name;
    private String color;
    private double maxSpeed;
    private int countOfWheels;
    private int actualSteeringDegree;
    private int countOfGears;
    private int tankCapacityIsFull;
    private double currentSpeed = 0;

        public Vehicle(String name, String color, double maxSpeed, int countOfWheels, int countOfGears, int tankCapacityIsFull){
            this.name = name;
            this.color = color;
            this.maxSpeed = maxSpeed;
            this.countOfWheels = countOfWheels;
            this.countOfGears = countOfGears;
            this.tankCapacityIsFull = tankCapacityIsFull;
        }



    public String getColor() {
        return color;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public int getActualSteeringDegree() {
        return actualSteeringDegree;
    }

    public int getCountOfGears() {
        return countOfGears;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public String getName() {
        return name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getTankCapacityIsFull() {
        return tankCapacityIsFull;
    }

    public void setTankCapacityIsFull(int tankCapacityIsFull) {
        this.tankCapacityIsFull = tankCapacityIsFull;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void stop() {
        this.currentSpeed = 0;
    }

    public void move(int speedOfMoment, int direction) {
        currentSpeed = speedOfMoment;
        actualSteeringDegree = direction;
        System.out.println("Vehicle moving with speed "+ currentSpeed + "in the direction" + actualSteeringDegree);
    }
    public void changingGears (int numberOfGear){
        if (numberOfGear == 0){
            System.out.println("Revers");
        }
        if (numberOfGear > 0 && numberOfGear <= currentSpeed){
            currentSpeed = (maxSpeed / countOfGears)* numberOfGear;

        }else {
            System.out.println("Select the correct gear");
        }
    }
    public void generalCharacteristic(){
        System.out.println("Vehicle " + name);
        System.out.println("Color " + color);
        System.out.println("Maximum speed " + maxSpeed);
        System.out.println("Volume of the fuel tank " + tankCapacityIsFull);
    }
}