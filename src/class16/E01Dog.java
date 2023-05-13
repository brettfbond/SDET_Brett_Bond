package class16;

public class E01Dog {

    String name;
    String color;
    String breed;

    void bark() {
        System.out.println(name + " is barking");
    }
    void printInfo() {
        if (breed.equals("German")) {
            System.out.println(name + " " + color + " I can work in NYPD");
        } else System.out.println(name + " can be used as pet");
    }
}
