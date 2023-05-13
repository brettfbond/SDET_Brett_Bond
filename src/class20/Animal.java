package class20;

public class Animal {
    String name;
    String breed;
    int age;
    Animal() {}
    Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Animal(String name, String breed, int age) {
        this(name, breed);
        this.age = age;
    }

    public void speak() {
        System.out.println("Speaking");
    }
    public void sleep() {
        System.out.println("Sleeping");
    }
    public void printAge() {
        System.out.println(age);
    }
}
class Dog extends Animal {
    Dog (String name, String breed, int age) {
        super(name, breed, age);
    }
    @Override
    public void speak() {
        System.out.println("Ruff");
    }

}
class Cat extends Animal {
    Cat (String name, String breed, int age) {
        super(name, breed, age);
    }
}
class Horse extends Animal {
    Horse (String name, String breed, int age) {
        super(name, breed, age);
    }
}
class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido", "labrador", 10);
        dog.sleep();
        dog.speak();
    }
}