package class4;

import java.util.Scanner;

public class DMV {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = scan.nextInt();

        if (age >= 18)
            System.out.println("Congratulations! You may apply for a driver's license.");
        else if (age < 15)
            System.out.println("Stick to your bike, kid.");
        else
            System.out.println("You may apply for a learner's permit.");
    }
}
