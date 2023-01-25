package Collection_framework;

import java.util.HashSet;

public class Set {

    public static void main(String[] args) {
        HashSet fruits = new HashSet();
        fruits.add("Apple");
        fruits.add(3);
        fruits.add("lemon");
        fruits.add("Tarun Tej");
        fruits.add("apple");
        fruits.add("Apple");

        System.out.println(fruits);
        System.out.println("Have lemons? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("Reamining items = " + fruits.size());
    }
}
