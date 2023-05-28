package class4;

import java.util.Scanner;

public class LoanAmount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the loan amount you need.");
        int loanRequest = scan.nextInt();

        if (loanRequest <= 200000)
            System.out.println("Congratulations! You are approved.");
        else
            System.out.println("We're sorry. Your loan request has been DENIED.");
    }
}
