package class6.HWClass6;

import java.util.Scanner;

public class HW3CurrentTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("What hour is it?");
        int hour = scan.nextInt();
        String timeOfDay = "";

        if (hour >=1 && hour <= 11) {
            timeOfDay = "Morning";
        } else if (hour >= 12 && hour <= 15) {
            timeOfDay = "Afternoon";
        } else if (hour >= 16 && hour <= 20) {
            timeOfDay = "Evening";
        } else if (hour >= 21 && hour <= 24) {
            timeOfDay = "Night";
        }

        System.out.println("It is the " + timeOfDay);
    }
}
