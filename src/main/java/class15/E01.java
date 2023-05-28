package class15;

import java.util.Arrays;

public class E01 {

    // create a method that takes a number as input and creates an array of
    // ints with size give by that number fill the array with some numbers lets
    // say 10 call the method createArray

    int[] createArrOfSizeX(int size, int num) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = num;
        }
        return arr;
    }

    public static void main(String[] args) {

        E01 obj = new E01();
        int[] arr1 = obj.createArrOfSizeX(8,10);
        System.out.println(Arrays.toString(arr1));
    }

}
