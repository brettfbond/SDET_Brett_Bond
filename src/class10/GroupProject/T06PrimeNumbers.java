package class10.GroupProject;

import java.util.Scanner;

public class T06PrimeNumbers {
    public static void main(String[] args) {
        //Write a java program to check whether a given
        //number is prime or not?

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = scan.nextInt();
        for (int i = 2; i <= input; i++) {
            if (input % i == 0 && input != i) {
                System.out.println(input + " is not a Prime number");
                break;
            } else if (i == input) {
                System.out.println(input + " is a Prime number");
            }

        }
    }
}
