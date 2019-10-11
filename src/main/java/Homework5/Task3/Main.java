package Homework5.Task3;

public class Main {
    public static void main(String[] args) {
        int a = args.length;
        System.out.println(a);

        try {
            int b = 10 / a;
        }catch (ArithmeticException e){
            System.out.println("Division by zero is impossible");
        }
        int[] c = {1};
         try {
             System.out.println(c[1]);
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Index goes beyond");
         }


    }

}



