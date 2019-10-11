package Homework5.Task2;


public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(divideByZero());
        }catch (ArithmeticException e){
            System.out.println("Division by zero is impossible");
        }

    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a / b;
    }
}

