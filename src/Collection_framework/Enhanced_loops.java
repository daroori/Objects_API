package Collection_framework;

import java.util.ArrayList;

public class Enhanced_loops {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Gohan");
        fruits.add("lemon");
        fruits.add("Tarun Tej");
        fruits.add("apple");
        fruits.add("Apple");

//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

      //  fruits.forEach(f -> System.out.println(f));

        fruits.forEach(f ->{
            f = "fruit: " + f;
            System.out.println(f);
            }
        );

        };
    }

