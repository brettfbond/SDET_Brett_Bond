package class24;

import java.util.ArrayList;
import java.util.Iterator;

public class E10ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("newt");
        words.add("finger");
        words.add("space");
        words.add("kale");
        words.add("keyboard");
        words.add("lie");

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {    //returns true if there is another element in the list
            String word = iterator.next();
            if (word.endsWith("e")) {
                iterator.remove();
            }
        }

        words.removeIf(word->word.endsWith("e"));
    }
}
