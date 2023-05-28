package class21;

public class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }
    void speak() {
        System.out.println("Animal speaks");
    }
    void sleep() {
        System.out.println("Animals sleep from 1 to 20 hours a day");
    }
    void eat() {
        System.out.println("Animals eat many different things");
    }
}
class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak() {
        System.out.println("Ruff");
    }
    @Override
    void sleep() {
        System.out.println("Dogs sleep about 16 hours");
    }
    @Override
    void eat() {
        System.out.println("Dogs like to chew bones");
    }
}
class Cat extends Animal {

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak() {
        System.out.println("Meow");
    }
    @Override
    void eat() {
        System.out.println("Cat eats fish");
    }
    @Override
    void sleep() {
        System.out.println("Cats like to sleep 15 hours on average");
    }
}
class Horse extends Animal {

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak() {
        System.out.println("Nay");
    }
    @Override
    void sleep() {
        System.out.println("Horses sleep 2-3 hours");
    }
    @Override
    void eat() {
        System.out.println("Horses eat hay");
    }
}
class AnimalTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Shaggy", "black", "German shepherd");
        dog1.printInfo();

        Dog dog2 = new Dog("Lal", "black", "Persian");
        Dog[] dogs = {dog1, new Dog("Papi", "white", "Chinese")};
        for (Dog dog : dogs) {
            dog.printInfo();
        }

        Animal[] animals = {new Dog("Pepper", "charcoal", "lab"), new Cat("Tom", "blue", "Siamese")};
        for (Animal animal : animals) {
            animal.printInfo();
        }
    }
}
