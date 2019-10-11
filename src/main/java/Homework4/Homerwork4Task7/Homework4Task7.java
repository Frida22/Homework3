package Homework4.Homerwork4Task7;

import java.util.HashMap;
import java.util.Map;

public class Homework4Task7 {
    public static void main(String[] args) {
        Map<String,String> grownInTheGarden = new HashMap<String, String>();
        grownInTheGarden.put("watermelon", "berry");
        grownInTheGarden.put("banana", "fruit");
        grownInTheGarden.put("cherry","berry");
        grownInTheGarden.put("pineapple","fruit");
        grownInTheGarden.put("melon","vegetable");
        grownInTheGarden.put("cranberry","berry");
        grownInTheGarden.put("apple","fruit");
        grownInTheGarden.put("iris","flower");
        grownInTheGarden.put("potato","vegetable");
        grownInTheGarden.put("carrot","vegetable");

        for(Map.Entry<String, String> grown : grownInTheGarden.entrySet()){
            System.out.println(grown.getKey()+" - "+grown.getValue());

        }


    }
}
