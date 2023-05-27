package class23;

import java.util.ArrayList;

public class E03Collections {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Moncef");
        names.add("Vlad");
        names.add("Microsoft Axel");
        names.add("Adam");
        names.add("Marina");
        names.add("Farwa");

        // names.clear();
        names.remove(1);
        names.remove("Adam");
    }
}
