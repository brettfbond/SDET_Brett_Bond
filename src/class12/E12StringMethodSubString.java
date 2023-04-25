package class12;

public class E12StringMethodSubString {
    public static void main(String[] args) {

        String sentence = "Yup we have another class";
        System.out.println(sentence.substring(12)); // another class
        System.out.println(sentence.substring(4, 11)); // we have
        System.out.println(sentence.substring(sentence.length() - 5)); // prints last 5 characters
    }
}
