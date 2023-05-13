package class18;
// Multilevel inheritance example
public class Person {
    String name;
    void sleep() {
        System.out.println("ZZzzZZZzzz");
    }
}

class Employee extends Person {

}

class Tester extends Employee {

}

class PersonTester {
    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.name = "Sarah";
        Employee employee = new Employee();
        employee.sleep();
        tester.sleep();
    }
}
