package class14;

public class ArrayManipulator {

    /*
    Create a method that will take an int array called sumArr and return the sum of all the elements from that array.
    Create the obj of the class and call the method.
     */

    int sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        ArrayManipulator obj = new ArrayManipulator();
        int[] array = {10,20,30};
        int result = obj.sumArr(array);
        System.out.println(result);
    }
}
