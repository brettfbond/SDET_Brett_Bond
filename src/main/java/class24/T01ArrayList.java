package class24;

import java.util.ArrayList;

public class T01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lais");
        names.add("Axel");
        names.add("Halima");
        names.add("Brett");
        names.add("Vlad");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Lais"));
        System.out.println(names.size());
        System.out.println(names);

    }


}
