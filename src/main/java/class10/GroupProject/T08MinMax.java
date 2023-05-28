package class10.GroupProject;

public class T08MinMax {
    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int[][] numbers = {
                {3,7,6,10},
                {98,3,17,8},
                {4,28,4,7}
        };
        int max = numbers[0][0];
        int min = numbers[0][0];

        for (int[] number : numbers) {
            for (int i : number) {
                if (i > max) {
                    max = i;
                }
                if (i < min) {
                    min = i;
                }
            }
        }
        System.out.println("The maximum number is " + max + " and the minimum number is " + min);
    }
}
