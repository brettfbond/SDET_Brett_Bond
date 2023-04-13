package class10;

public class E1Arrays2D {
    public static void main(String[] args) {

        int[][] matrix = {
                {10, 20, 30},
                {20, 50, 65},
                {102, 54, 60}
        };
        System.out.println(matrix[1][1]); // row index 1 and column index 1 (50)
        System.out.println(matrix[0][2]); // row index 0 and column index 2 (30)
    }
}
