package class10.GroupProject;

public class T04EvenOddSum {
    public static void main(String[] args) {

        int[][] numbers = {
                {3,7,6,10},
                {98,3,17,8},
                {4,28,4,7}
        };
        int sumEven = 0;
        int sumOdd = 0;

        for (int[] number : numbers) {
            for (int i : number) {
                if (i % 2 == 0){
                    sumEven += i;
                } else {
                    sumOdd += i;
                }
            }
        }
        System.out.println("Even sum: " + sumEven);
        System.out.println("Odd sum: " + sumOdd);
    }
}
