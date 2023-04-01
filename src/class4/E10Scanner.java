package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gender");
        char gender = scan.next().charAt(0);
        System.out.println("You entered " + gender);
    }
}
