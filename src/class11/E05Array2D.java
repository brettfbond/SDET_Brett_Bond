package class11;

public class E05Array2D {
    public static void main(String[] args) {

        // count how many are even

        int [][] arr2D = {
                {10,20,30,40,50,},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };
        int count = 0;

        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
