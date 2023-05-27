package class22;

public class Methods {
    public int findNumber(int[] arr, int num) {
        int numAt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                numAt = i;
            }
        }
        return numAt;
    }
    public int average(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
}
class MethodsTester {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int[] arr = {12,14,3};
        System.out.println("Number found at index " + methods.findNumber(arr, 3));
        System.out.println("The average is " + methods.average(arr));
    }
}
