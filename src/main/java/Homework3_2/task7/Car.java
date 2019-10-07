package Homework3_2.task7;

public class Car extends Vehicle {

    private boolean isCabriolet;
    private int countOfDoors;
    private int countOfPassengers;

    public Car(String name, String color, double maxSpeed, int countOfWheels, int countOfGears, int tankCapacityIsFull, int countOfDoors, int countOfPassengers) {
        super(name, color, maxSpeed, countOfWheels, countOfGears, tankCapacityIsFull);
        if(countOfPassengers<=8){
            this.countOfPassengers = countOfPassengers;
        }
        if(countOfDoors<=5){
            this.countOfDoors = countOfDoors;
        }
    }

    public boolean isCabriolet() {
        return isCabriolet;
    }

    public int getCountOfDoors() {

        return countOfDoors;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void roofOpening() {
        if (isCabriolet) {
            System.out.println("You can open the roof");
        } else {
            System.out.println("The roof cannot be opened");
        }
    }
    public void generalCharacteristic(){
        System.out.println("Vehicle " + getName());
        System.out.println("Color " + getColor());
        System.out.println("Maximum speed " + getMaxSpeed());
        System.out.println("Volume of the fuel tank " + getTankCapacityIsFull());
        System.out.println("Number of passenger seats " + countOfPassengers);
        System.out.println("Count of door "+countOfDoors);
    }

}

