package class9;

import java.util.Scanner;

public class E13Arrays {
    public static void main(String[] args) {

        int [] numbers = new int[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number");
            numbers[i] = scan.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
