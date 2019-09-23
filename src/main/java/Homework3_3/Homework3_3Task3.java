package Homework3_3;

public class Homework3_3Task3 {
    public static void main(String[] args) {
        int number = 100;
        int[] numbersArray = new int[101];
        for (int i = 101; i > 0; i--) {
            numbersArray[101-i] = number;
            number--;
        }
        for (int elem : numbersArray) {
            System.out.println(elem);
        }
    }
}
