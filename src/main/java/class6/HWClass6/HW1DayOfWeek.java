package class6.HWClass6;

import java.util.Scanner;

public class HW1DayOfWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("What day number is it?");
        int day = scan.nextInt();

        if (day > 0 && day < 6) {
            System.out.println("It is a weekday.");
        } else if (day == 6 || day == 7){
            System.out.println("It is the weekend.");
        } else {
            System.out.println("Invalid day");
        }
    }
}
