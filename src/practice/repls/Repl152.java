package practice.repls;

public class Repl152 {
}
class Parent {
    String city;
    Parent () {
        System.out.println("Parent Constructor");
    }
    Parent(String city) {
        this.city = city;
        System.out.println(city);
    }
}
class Child extends Parent {
    Child(String city) {
        super.city = city;
        System.out.println(city);
    }
}
class Main {
    public static void main(String[] args) {
        Child child = new Child("Vienna");
    }
}
