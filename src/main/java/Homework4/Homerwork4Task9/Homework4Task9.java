package Homework4.Homerwork4Task9;

import java.util.ArrayList;
import java.util.HashSet;

public class Homework4Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> listOfOneHundred = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++){
            listOfOneHundred.add((int) (Math.random()* 50));
        }
        HashSet<Integer> uniqueNumbers = new HashSet<Integer>(listOfOneHundred);

        System.out.println(listOfOneHundred);
        System.out.println(listOfOneHundred.size());
        System.out.println(uniqueNumbers);
    }
}
