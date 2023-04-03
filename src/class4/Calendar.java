package class3;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What month number is it?");
        int monthNum = scan.nextInt();
        String monthName = "";

        if (monthNum > 12)
            System.out.println("This is not a month!");
        else {
            switch (monthNum) {
                case 1 -> monthName = "January";
                case 2 -> monthName = "February";
                case 3 -> monthName = "March";
                case 4 -> monthName = "April";
                case 5 -> monthName = "May";
                case 6 -> monthName = "June";
                case 7 -> monthName = "July";
                case 8 -> monthName = "August";
                case 9 -> monthName = "September";
                case 10 -> monthName = "October";
                case 11 -> monthName = "November";
                case 12 -> monthName = "December";
            }
        }

            System.out.println("It is " + monthName + ".");


    }
}
