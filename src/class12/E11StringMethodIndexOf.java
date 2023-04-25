package class12;

public class E11StringMethodIndexOf {
    public static void main(String[] args) {

        String sentence = "Today is Saturday";
        System.out.println(sentence.indexOf('i')); // 6
        System.out.println(sentence.indexOf('a', 4)); // 10 (starts searching from index 4)

        System.out.println("----------------");

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                System.out.println(i);
            }
        }
    }
}
