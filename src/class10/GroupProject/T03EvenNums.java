package class10.GroupProject;

public class T03EvenNums {
    public static void main(String[] args) {

        int[][] numbers = {
                {3,7,6,10},
                {98,3,17,8},
                {4,28,4,7}
        };
        for (int[] number : numbers) {
            for (int i : number) {
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
