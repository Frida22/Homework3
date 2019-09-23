package Homework3_3;

public class Homework3_3Task10 {
    public static void main(String[] args) {
        String [] a = new String[5];
        a [0] = "**********";
        a [4] = a[0];
        for (int i =1;i<4;i++) {
            a[i] = "*        *";
        }
        for(String elem:a){
            System.out.println(elem);
        }
    }
}

