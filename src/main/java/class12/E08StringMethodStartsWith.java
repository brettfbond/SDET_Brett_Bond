package class12;

public class E08StringMethodStartsWith {
    public static void main(String[] args) {

        String sentence = "Java is very easy";
        System.out.println(sentence.startsWith("Java"));

        // method chaining is possible in the String class
        sentence = sentence.trim().toLowerCase();
        System.out.println(sentence.startsWith("java"));

    }
}
