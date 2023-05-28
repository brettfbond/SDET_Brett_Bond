package class25;

import java.util.TreeSet;

public class E05Sets {
    public static void main(String[] args) {

        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("banana");
        fruits.add("banana");
        System.out.println(fruits); // still no duplicates, but sorts the data

    }
}
