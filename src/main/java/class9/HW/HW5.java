package class9.HW;

public class HW5 {
    public static void main(String[] args) {

        // Create an array of animals and store 5 elements into it.
        // Using 2 different loops print all elements from the array.

        String[] animal = {"dog", "cat", "ferret", "panda", "skunk"};

        for (int i = 0; i < animal.length; i++){
            System.out.println(animal[i]);
        }

        for (String s : animal) {
            System.out.println(s);
        }
    }
}
