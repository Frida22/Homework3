package Homework5.Task4;

public class Task4 {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
//        } catch (Exception e) {
//            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
