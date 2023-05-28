package class25;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class E06CollectionsFramework {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("kiwi");
        fruits.add("banana");
        fruits.add("banana");

        HashSet<String> hashSet = new HashSet<>(fruits); // converts ArrayList to HashSet
        System.out.println(hashSet);

    }
}
