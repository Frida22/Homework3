package Homework3_3;

public class Homework3_3Task6 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456));
    }

    private static int getEvenDigitSum(int a) {
        if (a < 0) {
            return (-1);
        }
        int sum = 0;
        int divNumber = a;
        int modNumber;
        while (divNumber != 0) {
            modNumber = divNumber % 10;
            divNumber = divNumber / 10;
            if (modNumber % 2 == 0) {
                sum += modNumber;
        }
        }
        return (sum);
    }

}

