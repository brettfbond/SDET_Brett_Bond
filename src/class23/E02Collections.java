package class23;

import java.util.ArrayList;

public class E02Collections {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Moncef");
        names.add("Vlad");
        names.add("Microsoft Axel");
        names.add("Adam");
        names.add("Marina");

        System.out.println(names);
        System.out.println(names.size()); // Current size of list
        System.out.println(names.contains("Vlad")); // true
        System.out.println(names.get(0)); // Moncef   value at index 0
        names.remove("Vlad");
    }
}
