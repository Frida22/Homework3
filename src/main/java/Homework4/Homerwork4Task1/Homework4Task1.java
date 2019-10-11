package Homework4.Homerwork4Task1;

import java.util.ArrayList;

public class Homework4Task1 {
    public static void main(String[] args) {

        ArrayList<String> flowers = new ArrayList<String>();
        flowers.add("Rose");
        flowers.add("Ficus");

        for (String f : flowers){
            System.out.println(f);
        }
        System.out.println(flowers);
    }
}
