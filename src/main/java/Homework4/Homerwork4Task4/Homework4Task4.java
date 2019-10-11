package Homework4.Homerwork4Task4;

import java.util.Random;

public class Homework4Task4 {
    public static void main(String[] args) {
        int count = 0;
        Random r = new Random();
        int[] numbersArray = new int[15];
        for (int i = 0; i < 15; i++) {
            numbersArray[i] = r.nextInt(10);
            System.out.println(numbersArray[i]);
            if (numbersArray[i] % 2 == 0 && numbersArray[i] != 0) {
                count++;
            }
        }
        System.out.println("Even elements " +count);

    }
}
