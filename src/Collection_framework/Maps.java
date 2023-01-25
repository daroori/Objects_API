package Collection_framework;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("Apple",95);
        fruitCalories.put("mango",80);
        fruitCalories.put("banana",105);
        fruitCalories.put("lemon",26);
        //fruitCalories.put("lemon",36); // Overrides existing value.
        fruitCalories.putIfAbsent("lemon",20);

//        System.out.println(fruitCalories);
//
//        System.out.println(fruitCalories.get("banana"));
//
//        System.out.println(fruitCalories.containsKey("Apple"));
//        System.out.println(fruitCalories.containsValue(26));

        fruitCalories.forEach((k,v) -> {
            System.out.println(k + " Calories : " + v);
        });


    }
}
