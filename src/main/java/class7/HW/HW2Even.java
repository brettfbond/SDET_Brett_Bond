package class7.HW;

public class HW2Even {
    public static void main(String[] args) {

        // Even numbers 20 to 1 (2 ways)

        int i = 20;
        while (i > 1) {
            System.out.print(i + " ");
            i -= 2;
        }

        System.out.println();

        int m = 20;
        while (m > 1) {
            if (m % 2 == 0) {
                System.out.print(m + " ");
            }
            m--;
        }
    }
}
