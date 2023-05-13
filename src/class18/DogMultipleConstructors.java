package class18;

public class DogMultipleConstructors {

    String name;
    String color;
    String size;
    int age;
    double weight;

    public DogMultipleConstructors(String name, String color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public DogMultipleConstructors(String name, String color, String size, int age) {
        this(name, color, size);
        this.age = age;
    }

    public DogMultipleConstructors(String name, String color, String size, int age, double weight) {
        this(name, color, size, age);
        this.weight = weight;
    }
}
