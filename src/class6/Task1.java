package class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your height in inches?");
        int height = scan.nextInt();
        String classification = "";

        if (height < 60) {
            classification = "Short";
        } else if (height > 72) {
            classification = "tall";
        } else {
            classification = "medium";
        }

        System.out.println("You are a " + classification + " person.");
    }
}
