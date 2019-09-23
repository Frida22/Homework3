package Homework3_3;

public class Homework3_3Task5 {
    public static void main(String[] args) {
        System.out.println(minimumFrom4Arguments(4,7,12,-1));
    }

    public static int minimumFrom4Arguments(int a, int b, int c, int d) {
        {
            if (a < b && a < c && a < d) {
                return a;
            }
            if (b < a && b < c && b < d) {
                return b;
            }
            if (c < a && c < b && c < d) {
                return c;
            } else {
                return d;
            }
        }
    }
}

