package class10;

public class E3Arrays2D {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };

        int [] arr1 = matrix[0]; // assigns the first row as its own separate 1D array

        for (int i : arr1){
            System.out.println(i);
        }

    }
}
