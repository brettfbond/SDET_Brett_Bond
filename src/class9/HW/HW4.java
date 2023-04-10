package class9.HW;

public class HW4 {
    public static void main(String[] args) {

        // Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.

        String[] car = {"Kia", "Nissan", "Honda", "Dodge", "Chevy", "Toyota"};

        for (int i = 0; i < 6; i++) {
            System.out.println(car[i]);
        }

        for (String s : car) {
            System.out.println(s);
        }
    }
}
