package class10.HWClass10;

public class HW4Numbers {
    public static void main(String[] args) {

        int[][] numbers = {
                {3,7,6},
                {98,3,17},
                {4,28,4}
        };
        int sum = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
