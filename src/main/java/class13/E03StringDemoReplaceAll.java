package class13;

public class E03StringDemoReplaceAll {
    public static void main(String[] args) {

        String str = "glkqwekWOGIJEUDKLJ4681256#$%*&^%$&^%!";

        System.out.println(str.replaceAll("[^a-z]", "")); // ^ acts as the Not operator in regex
        System.out.println(str.replaceAll("[^a-z0-9A-Z]", "")); // so it is saying "Don't replace these"


    }
}
