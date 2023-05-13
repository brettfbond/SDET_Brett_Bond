package class16;

public class T01SumArray {
    int addArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        T01SumArray obj = new T01SumArray();
        int[] arr = {3,7,9,2,1};
        System.out.println(obj.addArr(arr));
    }
}
