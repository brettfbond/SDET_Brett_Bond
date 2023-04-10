package class9.HW;

public class HW1 {
    public static void main(String[] args) {

        // Create an array of chars and store grades into it: A,B,C,D.
        // Then print a grade B (use 2 different ways of creating an array).

        char [] grade = {'A', 'B', 'C', 'D'};
        System.out.println(grade[1]);

        char[] score = new char[4];
        score[0] = 'A';
        score[1] = 'B';
        score[2] = 'C';
        score[3] = 'D';
        System.out.println(score[1]);

    }
}
