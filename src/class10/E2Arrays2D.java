package class10;

public class E2Arrays2D {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3]; // 3 rows and 3 columns

        matrix[0][0] = 10;
        matrix[1][1] = 20;
        matrix[2][2] = 50; // Java will assign 0 to any unassigned elements

        System.out.println(matrix[2][1]); // 0
    }
}
