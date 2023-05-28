package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        // in a loop, ask the user to enter numbers if user enters any
        // number other than -1 print "Hello World" and keep on asking the user for a number.
        // The moment the user enters the number -1, the loop should stop

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        while (num != -1) {
            System.out.println("Please try again:");
            num = scan.nextInt();
        }
    }
}
