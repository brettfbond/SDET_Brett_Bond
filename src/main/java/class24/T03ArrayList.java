package class24;

import java.util.ArrayList;

public class T03ArrayList {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("tea");
        drinks.add("water");
        drinks.add("Dr P");

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("e") || drink.contains("a")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
    }
}
