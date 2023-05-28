package class10;

public class E4Arrays2D {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };

        for (int j = 0; j < 3; j++) {
            int [] arr1 = matrix[j]; // will move to the next matrix row with each iteration
            for (int i : arr1){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
