package class23.groupProject02;
// Check if a String is Palindrome: Determine whether a given string is
// a palindrome, which means it reads the same forwards and
// backward. For example, "madam" is a palindrome.
import java.util.Scanner;

public class T02Palindrome {

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
