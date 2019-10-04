package Homerwork4;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework4Task6 {
    public static void main(String[] args) {
        ArrayList<String> stringNumbers = new ArrayList<String>(
                Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"));



        int maxLength = 0;

        for (String n : stringNumbers){
            if (n.length()>maxLength){
                maxLength = n.length();
            }
        }
        for (String nn : stringNumbers){
            if (nn.length() == maxLength){
                System.out.println(nn);
            }
        }

    }
}