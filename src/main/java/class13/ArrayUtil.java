package class13;

public class ArrayUtil {

    void searchArray(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                System.out.println("Yup.");
                break;
            }
        }
    }
}
