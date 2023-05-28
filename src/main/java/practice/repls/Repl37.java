package practice.repls;

import java.util.Scanner;

public class Repl37 {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty = scan.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean sleepy = scan.nextBoolean();
        String drink = "";

        if (thirsty && !sleepy) {
            drink = "water";
        } else if (thirsty && sleepy) {
            drink = "coffee";
        } else if (!thirsty && sleepy) {
            drink = "tea";
        } else {
            drink = "nothing";
        }
        System.out.println("Looks like you need to drink " + drink);
    }
}
