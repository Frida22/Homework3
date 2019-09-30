package Homework3_2Task7;

public class GarbageTruck extends Car {
    public GarbageTruck(String name, String size, int tankCapacityIsFull) {
        super(name, size);
    }

    private int volumeOfTheGarbageCan;
    private int garbageCollected;

    public int getGarbageCollected() {
        return garbageCollected;
    }

    public void setGarbageCollected(int garbageCollected) {
        this.garbageCollected = garbageCollected;
    }

    public int getVolumeOfTheGarbageCan() {
        return volumeOfTheGarbageCan;
    }

    public void recyclingOfGarbageIntoGasoline() {
        while (getGasoline() < getTankCapacityIsFull()) {
            for(int i = 0; i<1; i++);
            setGasoline(getGasoline()+1);
            setGarbageCollected(getGarbageCollected()-1);



        }
    }
}