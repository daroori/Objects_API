package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal sasha = new Animal();
        sasha.makeSound();

        Dog rocky = new Dog();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch(); //Type Casting


//        sasha = new Dog();
//        sasha.makeSound();
//        ((Dog)sasha).fetch(); //Type Casting
        feed(rocky);
        feed(sasha);


        boolean isDog = sasha instanceof Cat; // Checking if instance
        System.out.println(isDog);

    }
    public static void feed(Animal animal){
        if(animal instanceof Dog TheDog){
            System.out.println("Feed Dog food");
            TheDog.fetch();
        } else if (animal instanceof Cat TheCat) {
            System.out.println("Feed Cat food");
            TheCat.scratch();
        }
    }
}
