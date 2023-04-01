package class3;

public class E19IfElseStatements {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Time to study"); // prints
        }
        else {
            System.out.println("Time to work"); // does not print
        }

        int age = 17;
        if (age >= 18) {
            System.out.println("Time to study");
        }
        else {
            System.out.println("Time to work"); // false, so this prints
        }
    }
}
