package class19;

public class Animal {
    String name;
    String color;
    String breed;
    int age;
    int weight;
    public void printInfo() {
        System.out.println(name + " " + color + " " + breed + " " + age + " " + weight);
    }
    public Animal() {}

    public Animal(String name, String color, String breed, int age, int weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("Jack", "black", "Clydesday", 4, 500);
        horse1.printInfo();
    }
}
