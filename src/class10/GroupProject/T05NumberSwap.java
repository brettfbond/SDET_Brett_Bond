package class10.GroupProject;

import java.util.Scanner;

public class T05NumberSwap {
    // Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] arr = {a,b};
        a = arr[1];
        b = arr[0];

        System.out.println(a + " " + b);
    }
}
