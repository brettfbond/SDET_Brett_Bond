package practice.repls;

public class Repl139 {
    public static String alphabetical(String str) {
        StringBuilder alph = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) alph.append(str.charAt(i));
            else if (str.charAt(i) > str.charAt(i - 1)) {
                alph.append(str.charAt(i));
            }
        }
        return alph.toString();
    }
    public static void main(String[] args) {
        System.out.println(Repl139.alphabetical("hello"));
        System.out.println(Repl139.alphabetical("software"));
        System.out.println(Repl139.alphabetical("language"));
    }
}
