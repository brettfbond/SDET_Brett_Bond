package class15;

public class E02 {

    // create a method that takes an array as input.
    // It adds all the numbers from the array and returns the sum.
    // name of the method should be sumArr

    int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        E02 obj = new E02();
        int[] arr1 = {34,2,56,4,8,4};
        System.out.println(obj.sumArr(arr1));
    }
}
