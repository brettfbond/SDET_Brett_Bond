package practice;

import java.util.Scanner;

public class ScannerTutorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What's your first name?");
        String firstName = scan.next();
        System.out.println(firstName);

        System.out.println("What's your age?");
        int age = scan.nextInt();

        System.out.println("What's your senior quote?");
        String quote = scan.next();
        quote += scan.nextLine();

        System.out.println("Thank you " + firstName + ". You are " + age + " years old,");
        System.out.println("and your senior quote is " + quote);
    }
}
