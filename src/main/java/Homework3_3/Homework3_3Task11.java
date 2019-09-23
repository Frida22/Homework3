package Homework3_3;

public class Homework3_3Task11 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5-i; j++)
                System.out.print(" ");
            for (int k = 0; k < i*2+1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}