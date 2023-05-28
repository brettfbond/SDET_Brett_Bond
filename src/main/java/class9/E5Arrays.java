package class9;

public class E5Arrays {
    public static void main(String[] args) {

        String [] name = {"Brett", "Robin", "Skylar", "Aubrey", "Carol"};

        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }

        System.out.println();

        char [] letter = {'a', 'b', 'c', 'd', 'e'};

        for (int i = 0; i < letter.length; i++) {
            if (i % 2 == 0) {
                System.out.println(letter[i]);
            }
        }
    }
}
