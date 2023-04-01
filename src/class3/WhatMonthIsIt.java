package class3;

import java.util.Scanner;

public class WhatMonthIsIt {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What month number is it?");
        int monthNum = scan.nextInt();
        String monthName = "";

        if (monthNum > 12)
            System.out.println("This is not a month!");
        else {
            if (monthNum == 1)
                monthName = "January";
            else if (monthNum == 2)
                monthName = "February";
            else if (monthNum == 3)
                monthName = "March";
            else if (monthNum == 4)
                monthName = "April";
            else if (monthNum == 5)
                monthName = "May";
            else if (monthNum == 6)
                monthName = "June";
            else if (monthNum == 7)
                monthName = "July";
            else if (monthNum == 8)
                monthName = "August";
            else if (monthNum == 9)
                monthName = "September";
            else if (monthNum == 10)
                monthName = "October";
            else if (monthNum == 11)
                monthName = "November";
            else if (monthNum == 12)
                monthName = "December";

            String posOrNeg = "";

            if (monthNum < 0)
                posOrNeg = "negative";
            else
                posOrNeg = "positive";

            String evenOrOdd = "";

            if (monthNum % 2 == 0)
                evenOrOdd = "even";
            else
                evenOrOdd = "odd";


            System.out.println("It is " + monthName + ". This is an " + evenOrOdd + " month and the number is " + posOrNeg + ".");

        }
    }
}
