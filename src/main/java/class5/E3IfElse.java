package class5;

import java.util.Scanner;

public class E3IfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("You can't drive");
        } else {
            System.out.println("You can drive");
        }
    }
}
