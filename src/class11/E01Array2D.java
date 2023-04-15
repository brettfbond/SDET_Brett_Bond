package class11;

public class E01Array2D {
    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };

        for (int[] number : arr) {
            for (int i : number) {
                if (i % 2 == 1){
                    System.out.println(i);
                }
            }
        }


    }
}
