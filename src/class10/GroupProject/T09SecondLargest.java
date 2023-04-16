package class10.GroupProject;

public class T09SecondLargest {
    public static void main(String[] args) {

        // Maximum and minimum number in the array?

        int[][] numbers = {
                {3,7,6,10},
                {98,3,17,8},
                {4,28,4,7}
        };
        int largest = numbers[0][0];
        int secondLargest = numbers[0][0];

        for (int[] number : numbers) {
            for (int i : number) {
                if (i > secondLargest) {
                    secondLargest = i;
                }
                if (i > largest) {
                    secondLargest = largest;
                    largest = i;
                }
            }
        }
        System.out.println("The second largest number is " + secondLargest);
    }
}
