package Collection_framework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList fruits = new ArrayList();

        fruits.add("Apple");
        fruits.add(3);
        fruits.add("lemon");
        fruits.add("Tarun Tej");
        fruits.add("apple");
        fruits.add("Apple");

        System.out.println(fruits);

        System.out.println(fruits.get(3));

        fruits.set(2,"grape");
        System.out.println(fruits);
        System.out.println(fruits.indexOf("Apple"));
    }
}
