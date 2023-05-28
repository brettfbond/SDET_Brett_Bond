package class24;

import java.util.ArrayList;

public class T04ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 500; i+=2) {numbers.add(i);}
        numbers.removeIf(number->number % 5 == 0);

        System.out.println(numbers);
    }



}
