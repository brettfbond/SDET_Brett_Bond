package class12;

public class E07StringMethodTrim {
    public static void main(String[] args) {

        String sentence = "    Java is fun  ";
        System.out.println(sentence.trim()); // Removes spaces before and after the words. Does not remove spaces in between.
    }
}
