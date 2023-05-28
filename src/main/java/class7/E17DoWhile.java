package class7;

public class E17DoWhile {
    public static void main(String[] args) {

        // do while always runs the code once before checking the while

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i > 10); // Prints 0, then stops
    }
}
