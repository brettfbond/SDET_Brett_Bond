package class6.HWClass6;

import java.util.Scanner;

public class HW5Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter quiz grade:");
        double quiz = scan.nextDouble();
        System.out.println("Enter midterm grade:");
        double midterm = scan.nextDouble();
        System.out.println("Enter final grade:");
        double finalExam = scan.nextDouble();
        double average = (quiz + midterm + finalExam) / 3;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 70 && average < 90) {
            grade = 'B';
        } else if (average >= 50 && average < 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is " + grade);
    }
}
