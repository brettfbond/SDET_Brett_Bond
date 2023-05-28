package class18;

public class AnimalTester {
    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.color = "Black"; // can use attributes and methods from parent class
        horse.eat();
        horse.speak();

        Cat cat = new Cat();
        cat.name = "Mano";
        cat.sleep();
        cat.speak();
    }

}
