package class21;

public class E1Poly {

    public static void main(String[] args) {
            /*
        Dog dog1 = new Dog("Spot", "black/white", "dalmatian");
        Cat cat1 = new Cat("Smudges", "brown", "unknown");
        Horse horse1 = new Horse("Joe", "black", "Persian");

        dog1.speak();
        dog1.sleep();
        dog1.eat();

        cat1.speak();
        cat1.sleep();
        cat1.eat();

        horse1.speak();
        horse1.sleep();
        horse1.eat();
        */
    Animal[] animals = new Animal[3];
    animals[0] = new Dog("Spot", "black/white", "dalmatian");
    animals[1] = new Cat("Smudges", "brown", "unknown");
    animals[2] = new Horse("Joe", "black", "Persian");

    for (Animal animal : animals) {
        animal.speak();
        animal.sleep();
        animal.eat();
    }
    }
}
