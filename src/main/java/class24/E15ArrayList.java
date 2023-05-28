package class24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E15ArrayList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<Integer> names2 = new LinkedList<>();
        names2.add(10);
        names2.add(20);
        names2.add(44);
        names2.add(50);
        names2.add(100);
        System.out.println(names2);
        names2.add(1, 500);
        System.out.println(names2);

    }
}
