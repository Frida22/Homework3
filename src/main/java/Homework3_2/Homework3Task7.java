package Homework3_2;

public class Homework3Task7 {
    public static void main(String[] args) {
        //7. Comment variables which are never used.
        // ctrl + / - comment the line
        int a = 10;
        int b = 15;
        double c = b + 38;
//                int d = a + 12;
//                double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
//                String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }
}


