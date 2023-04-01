package class6.HWClass6;

import java.util.Scanner;

public class HW4Seasons {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("What is your birth month?");
        String birthMonth = scan.next();
        String season = switch (birthMonth) {
            case "December", "January", "February" -> "Winter";
            case "March", "April", "May" -> "Spring";
            case "June", "July", "August" -> "Summer";
            case "September", "October", "November" -> "Fall";
            default -> "";
        };

        System.out.println("You were born in the " + season);
    }
}
