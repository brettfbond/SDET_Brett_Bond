package class14;

public class E5ArrayUtils {

    boolean contains(int[] arr, int num) {
        boolean contain = false;
        for (int i : arr) {
            if (i == num) {
                contain = true;
                //break;
            }
        }
        return contain;
    }

    public static void main(String[] args) {

        E5ArrayUtils obj = new E5ArrayUtils();
        int[] numbers = {13,2,5,7};
        System.out.println(obj.contains(numbers, 2));

    }
}
