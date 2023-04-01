package class3;

public class E17IfStatements {
    public static void main(String[] args) {

        if (true) // will execute code in curly brackets
        {
            System.out.println("Batch 16 is doing really great");
        }

        if (false) // will not execute code in curly brackets
        {
            System.out.println("Batch 16 is doing really great");
        }

        boolean condition = true;
        if (condition) {
            System.out.println("yup");
        }

        int age = 19;
        if (age > 18) {
            System.out.println("You are allowed to vote.");
        }
    }
}
