package class7;

import java.util.Scanner;

public class E13WhileLoop {
    public static void main(String[] args) {

        // ask the user for a number then print all the numbers from 1 to that number

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scan.nextInt();
        int num = 1;
        while (num <= input) {
            System.out.println(num);
            num++;
        }
    }
}
