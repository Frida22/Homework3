package Homerwork4.Homerwork4Task3;

import java.util.HashMap;
import java.util.Map;

public class Vehicles {
    public static void main(String[] args) {

        Map<String, Integer> vehicle = new HashMap<String, Integer>();
        vehicle.put("BMW", 5);
        for (Map.Entry<String, Integer> v : vehicle.entrySet()) {
            System.out.println(v.getKey() + " " + v.getValue());
        }
    }
}