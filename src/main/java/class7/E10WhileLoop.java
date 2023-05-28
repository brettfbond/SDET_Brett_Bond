package class7;

public class E10WhileLoop {
    public static void main(String[] args) {

        // Print 1 2 4 5 7 8 10 11 13

        /*
        int number = 1;
        while (number < 14) {
            if (number != 3 && number != 6 && number != 9 && number != 12) {
                System.out.print(number + " ");
            }
            number ++;
        }

         */

        // Better way to do it:
        int num2 = 1;
        while (num2 < 14) {
            if (num2 % 3 != 0) {
                System.out.print(num2 + " ");
            }
            num2++;
        }
    }
}
