package class9.HW;

public class HW8 {
    public static void main(String[] args) {

        // Create an array to store char values and then print those in reverse order

        char[] letter = {'a', 'b', 'c', 'd', 'e'};
        for (int i = letter.length - 1; i >= 0; i--) {
            System.out.println(letter[i]);
        }
    }
}
