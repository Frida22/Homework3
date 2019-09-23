package Homework3_3;

public class Homework3_3Task7 {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(100, 13));
    }

    private static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        if (first == second) {
            return first;
        }
        if (first > second) {
            return getDivisor(first, second);
        }
        return getDivisor(second, first);
    }

    private static int getDivisor(int max, int min) {
        int divisor = min;
        while (!((max % divisor == 0) && (min % divisor == 0))) {
            divisor--;
        }
        return (divisor);
    }
}


