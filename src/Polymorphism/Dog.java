package Polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Woof");
    }

    public void fetch(){
        System.out.println("i can fetch, I am dog");
    }


}
