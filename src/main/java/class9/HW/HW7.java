package class9.HW;

public class HW7 {
    public static void main(String[] args) {

        // From an array of integer elements find the largest number.

        int[] num = {54, 23, 185, 87, 72, 65};
        int largest = num[0];
        for (int i : num) {
            if (i > largest){
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
