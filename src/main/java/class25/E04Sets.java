package class25;

import java.util.LinkedHashSet;

public class E04Sets {
    public static void main(String[] args) {

        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("kiwi");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("mango");
        System.out.println(fruits); // no duplicates but will remember order
    }
}
