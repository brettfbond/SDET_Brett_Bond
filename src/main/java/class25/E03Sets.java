package class25;

import java.util.HashSet;

public class E03Sets {
    public static void main(String[] args) {

        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Yellow");
        uniqueNames.add("Yellow"); // will ignore duplicates and not add to set
        uniqueNames.add("green");
        System.out.println(uniqueNames); // prints in random order
    }
}
