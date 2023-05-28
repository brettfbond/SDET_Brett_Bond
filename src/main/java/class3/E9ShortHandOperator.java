package class3;

public class E9ShortHandOperator {
    public static void main(String[] args) {

        int number = 10;
        /*
        number = number + 20; // long hand
        System.out.println(number); // 30
        */

        number += 20; // shorthand for number +
        System.out.println(number);
    }
}
