package class10;

public class E5Arrays2D {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30, 40, 50},
                {20, 50, 65, 20},
                {102, 54, 60},
                {20, 55}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }

        // Can also use enhanced for loop

        for (int[] rows : matrix) {
            for (int elements : rows) {
                System.out.print(elements + " ");
            }
            System.out.println();
        }
    }
}
