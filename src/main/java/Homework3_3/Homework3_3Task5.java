package Homework3_3;

public class Homework3_3Task5 {
    public static void main(String[] args) {
        System.out.println(minFromFourElem(6,6,9,7));

    }

    public static int minFromTwuElem(int a, int b) {
        if(a<b){
            return a;
        }else {
            return b;
        }
    }
    public static int minFromFourElem(int a, int b, int c, int d){
        return(minFromTwuElem( minFromTwuElem(a, b), minFromTwuElem(c,d)));
    }
}

