package Homerwork4.Homerwork4Task5;

import java.util.ArrayList;


public class Homework4Task5 {
    public static void main(String[] args) {

        ArrayList<String> furniture = new ArrayList<String>();
        furniture.add("Table");
        furniture.add("Chair");
        furniture.add("Wardrobe");
        furniture.add("Armchair");
        furniture.add("Sofa");

        System.out.println(furniture.size());

        for (String f : furniture) {
            System.out.println(f);
        }
    }
}
