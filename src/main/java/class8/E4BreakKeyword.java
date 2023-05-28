package class8;

public class E4BreakKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                break; // stops the for loop when i > 5
            }
            System.out.println(i);
        }

        System.out.println("--------------");

        int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += i;
            if (sum >= 300) {
                System.out.println(i);
                break; // stops the for loop once sum >= 300
            }
        }
    }
}
