package class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Are you hungry? (true or false)");
        boolean hungry = scan.nextBoolean();

        if (hungry)
            System.out.println("Let's order pizza");
        else
            System.out.println("Let's practice Java");
    }
}
