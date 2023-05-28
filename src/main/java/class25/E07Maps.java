package class25;

import java.util.HashMap;

public class E07Maps {
    public static void main(String[] args) {

        HashMap<String, Double> grocery = new HashMap<>();
        grocery.put("Apple", 2.5);  // (key, value)
        grocery.put("Soap", 3.1);
        grocery.put("Eggs", 3.5);
        grocery.put("Milk", 2.5);
        grocery.put("Apple", 4.5);  // using duplicate key overwrites the value
        System.out.println(grocery);
        System.out.println(grocery.size()); // 4
        System.out.println(grocery.containsKey("Banana")); // false
        System.out.println(grocery.containsKey("Eggs")); // true
        System.out.println(grocery.containsValue(2.5)); // true
    }
}
