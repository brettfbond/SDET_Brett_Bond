package class13;

public class E02StringDemoReplaceAll {
    public static void main(String[] args) {

        String str = "dlgkh409842SDYPJLKD&^%#%&";

        // regex = Regular Expressions. Can find patterns in Strings

        System.out.println(str.replaceAll("[a-z]", "*"));
        System.out.println(str.replaceAll("[A-Z]", "#"));
        System.out.println(str.replaceAll("[0-9]", "%"));
        System.out.println(str.replaceAll("[a-z]", "")); // Will remove a-z
        System.out.println(str.replaceAll("[a-z0-9]", "%"));
        System.out.println(str.replaceAll("[a-zA-K]", "%"));

        // You can also use the ASCII Table to assist in your range

        System.out.println(str.replaceAll("[A-z]", "&")); // Will replace all upper and lower case letters

        char c = 'A';
        c++; // Will take the next character in the ASCII Table
        System.out.println(c);
        System.out.println("-------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(c++);
        }

    }
}
