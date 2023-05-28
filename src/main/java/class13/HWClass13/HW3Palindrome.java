package class13.HWClass13;

import java.util.Scanner;

public class HW3Palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input a word or sentence to see if it's a palindrome:");
        String givenString = inp.nextLine().replace(" ","");

        StringBuilder reverseInput = new StringBuilder(givenString);
        reverseInput.reverse();
        String inputCheck = reverseInput.toString();

        boolean isPalindrome = inputCheck.equalsIgnoreCase(givenString);
        System.out.println(isPalindrome);
    }
}
