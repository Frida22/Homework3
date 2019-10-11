package Homework5.Task6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        try {
            System.out.print("Enter the number");
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {

        }
    }
}
