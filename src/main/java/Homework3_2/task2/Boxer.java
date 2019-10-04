package Homework3_2.task2;

public class Boxer {

    private int age;
    private int weight;
    private int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }

    public boolean fight(Boxer anotherBoxer) {

        if (anotherBoxer.getStrength() < this.strength) {
            return true;
        }
        if (anotherBoxer.getStrength() == this.strength) {

            if (anotherBoxer.getWeight() < this.weight) {
                return true;
            }
        }
        if (anotherBoxer.getStrength() == this.strength && anotherBoxer.getWeight() == this.weight) {
            return anotherBoxer.getAge() < this.age;
        }
        return false;
    }
}
