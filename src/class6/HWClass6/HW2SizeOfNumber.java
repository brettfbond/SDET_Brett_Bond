package class6.HWClass6;

import java.util.Scanner;

public class HW2SizeOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();

        if (number >= 1 && number <=10) {
            System.out.println("Your number is small.");
        } else if (number >= 11 && number <= 100) {
            System.out.println("Your number is medium.");
        } else if (number >= 101 && number <= 1000) {
            System.out.println("Your number is large.");
        }
    }
}
