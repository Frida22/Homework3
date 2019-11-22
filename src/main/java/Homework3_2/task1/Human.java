package Homework3_2.task1;

import javafx.util.Builder;

public class Human {

    public static void main(String[] args) {
        Human human = new Human.Builder().enterAge(12).enterFirstName("Bond").enterLastName("Bonda").enterWeight(25).enterHeight(25).build();
    }

    private float weight;
    private int age;
    private String firstName;
    private String lastName;
    private float height;

    public Human() {

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Human(String firstName, String lastName, int age, float weight, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public static class Builder {
        private Human human;

        public Builder() {
            human = new Human();
        }

        public Builder enterFirstName(String firstName) {
            human.firstName = firstName;
            return this;
        }

        public Builder enterLastName(String lastName) {
            human.lastName = lastName;
            return this;
        }

        public Builder enterAge(int age) {
            human.age = age;
            return this;
        }

        public Builder enterWeight(int weight) {
            human.weight = weight;
            return this;
        }

        public Builder enterHeight(int height) {
            human.height = height;
            return this;
        }

        public Human build() {
            return human;
        }

    }
}
