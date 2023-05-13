package practice.repls;

public class Repl150 {
    public static void main(String[] args) {
        Employee emp = new Employee("Joe", "Smith", 35, 35000);
        emp.printEmployee();

    }
}
class Person {
    String name;
    String lastName;
    int age;

    Person() {}
    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
class Employee extends Person {
    int salary;
    Employee() {}
    Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary = salary;
    }
    public void printEmployee() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}
class Student extends Employee {
    int grade;
    Student() {}
    Student(String name, String lastName, int age, int grade) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
    }
    public void printStudent() {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }
}
class Retiree extends Student {
    private String seniorActivity;
    public void printRetiree() {
        System.out.println(name + lastName + age + seniorActivity);
    }
}
