package Homework5.Task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> listForPrint = new ArrayList<Integer>();
        while (true) {
            try {
                System.out.print("Enter the number");
                Scanner scan = new Scanner(System.in);
                int number = scan.nextInt();
                listForPrint.add(number);
//                System.out.println(listForPrint);
            } catch (InputMismatchException e) {
                System.out.println(listForPrint);
                break;
            }
        }
    }
}