package Homerwork4;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework4Task6 {
    public static void main(String[] args) {
        ArrayList<String> stringNumbers = new ArrayList<String>(
                Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"));



        int maxLength = 0;

        for (String str : stringNumbers){
            if (str.length()>maxLength){
                maxLength = str.length();
            }
        }
        for (String str : stringNumbers){
            if (str.length() == maxLength){
                System.out.println(str);
            }
        }

    }
}