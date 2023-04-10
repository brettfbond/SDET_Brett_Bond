package class9.HW;

public class HW6 {
    public static void main(String[] args) {

        // Create an array on integers and calculate the sum of all elements in an array

        int[] num = {54, 654, 12, 354, 32, 455};
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println(sum);
    }
}
