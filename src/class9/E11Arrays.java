package class9;

public class E11Arrays {
    public static void main(String[] args) {

        int [] numbers = new int [5]; // declares variable but does not initialize yet. Will have an array of size 5
        int num = 50;

        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = num;
            num += 10;
        }

        for (int number : numbers) {
            System.out.println(number);
        }



    }
}
