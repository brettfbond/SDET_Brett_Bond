package class13.HWClass13;

public class HW1SentenceNoSpaces {
    public static void main(String[] args) {
        // Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String sentence = "This is a sentence.";
        String sentenceNoSpaces = sentence.replace(" ", "");
        System.out.println(sentenceNoSpaces);
    }
}
