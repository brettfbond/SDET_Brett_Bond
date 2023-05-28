package class3;

import java.util.Scanner;

public class ExpectedHours {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double hoursExpected = 2;

        System.out.println("How many hours did it take to do your homework?");
        double hoursActual = scan.nextDouble();

        if (hoursExpected >= hoursActual)
            System.out.println("You will love the course and you will succeed.");
        else
            System.out.println("Course will be very hard for you!");
    }
}
