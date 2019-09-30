package Homework3_2;

public class Boxers {
    //    2. Implement the method fight() depending on weight, strength and age of the boxer:
//    You should write dependency by yourself. The method should return true or false if our boxer won or lost.
    public static class Boxer {
        public int age;
        public int weight;
        public int strength;

        public Boxer(int age, int weight, int strength) {
            this.age = age;
            this.weight = weight;
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
            if (anotherBoxer.getStrength() < this.getStrength()) {
                return true;
            }
            if (anotherBoxer.getStrength() == this.getStrength()) {
                if (anotherBoxer.getWeight() < this.getStrength()) {
                    return true;
                }
            }
            if (anotherBoxer.getStrength() == this.getStrength() && anotherBoxer.getWeight() == this.getStrength()) {
                if (anotherBoxer.getAge() < this.getAge()) {
                    return true;
                }
            }
            return false;
        }
    }
}