package Homework3_2Task7;

public class Car extends Vehicle {
    private int maxSpeed;
    private String color;
    private int gasoline;
    private int speedOfMovement;
    private int numberOfCarPassengers;
    private int tankCapacityIsFull;


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getTankCapacityIsFull() {
        return tankCapacityIsFull;
    }

    public int getNumberOfCarPassengers() {
        return numberOfCarPassengers;
    }

    public String getColor() {
        return color;
    }

    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }

    public void setSpeedOfMovement(int speedOfMovement) {
        this.speedOfMovement = speedOfMovement;
    }

    public int getSpeedOfMovement() {
        return speedOfMovement;
    }

    public Car(String name, String size) {
        super(name, size);
    }


    public void speedSet(int maxSpeed, int gasoline) {
        if (gasoline > 0 && gasoline <= getTankCapacityIsFull()) {
            setSpeedOfMovement(10);
            while (getSpeedOfMovement() < maxSpeed) {

                for (int i = 0; i < 1; i++) {
                    setSpeedOfMovement(getSpeedOfMovement() + 20);
                    gasoline = gasoline - i;
                }
            }

        }else{
            System.out.println("Check the fuel level!");
        }
    }
    public void generalCharacteristicOfTheCar(){
        System.out.println("Car "+ getName() + "Color " +getColor()+"Maximum amount of movement "+ getMaxSpeed()+"Number of passengers "+ getNumberOfCarPassengers());
    }

}