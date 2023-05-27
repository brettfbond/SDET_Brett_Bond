package class24;

import java.util.ArrayList;

public class T02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("newt");
        words.add("finger");
        words.add("space");
        words.add("kale");
        words.add("keyboard");
        words.add("lie");

        /*

        for (String word : words) {
            if (word.endsWith("e")) {
                words.remove(word);

            }
        }
        */

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("e")) {
                words.remove(words.get(i));
                i--;
            }
        }
        System.out.println(words);
    }
}
