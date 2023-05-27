package class22;

public abstract class Animal {

    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void speak();

    abstract void sleep();

    abstract void eat();
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
        Animal[] animals = {
                new Dog("Billy", "tan", "mutt"),
                new Cat("Scruffy", "white", "Persian"),
                new Horse("Longnose", "brown", "Arabian")
        };
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
        }
    }

}
