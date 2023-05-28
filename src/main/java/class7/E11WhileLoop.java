package class7;

public class E11WhileLoop {
    public static void main(String[] args) {

        int num = 100;
        while (num > 0) {
            System.out.print(num + " ");
            num--;
        }
        System.out.println();
        num = 20;
        while (num <= 100) {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println();
        num = 100;
        while (num > 0) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num--;
        }
    }
}
