package Homework3_3;

public class Homework3_3Task4 {
    public static void main(String[] args) {
        int[] arrayForSumElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 1; i < 9; i++) {
            sum = sum + arrayForSumElements[i];
        }
        System.out.println(sum);
    }
}