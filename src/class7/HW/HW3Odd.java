package class7.HW;

public class HW3Odd {
    public static void main(String[] args) {

        // Odd numbers 20 to 50 (2 ways)

        for (int i = 20; i < 50; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int j = 21; j < 50; j += 2) {
            System.out.print(j + " ");
        }
    }
}
