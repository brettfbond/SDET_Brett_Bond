package class8;

public class E3ForLoop {
    public static void main(String[] args) {

        //Write a loop to add all the even numbers from 1 to 30.
        int sum = 0;
        for (int i = 2; i < 31; i += 2) {
            sum += i;
        }
        System.out.println(sum);

    }
}
