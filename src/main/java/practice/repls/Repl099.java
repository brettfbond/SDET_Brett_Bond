package practice.repls;

import java.util.Scanner;

public class Repl099 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine().replace(" ", "");
        //write your code below

        StringBuilder reverseInput = new StringBuilder(givenString);
        reverseInput.reverse();
        String inputCheck = reverseInput.toString();

        boolean isPalindrome = inputCheck.equalsIgnoreCase(givenString);
        System.out.println(isPalindrome);
    }
}
