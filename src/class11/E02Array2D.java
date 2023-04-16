package class11;

public class E02Array2D {
    public static void main(String[] args) {

        String[][] names = {{"Sarah", "Artem", "Lean", "Semir"}, {"Farwa", "Halima", "Alina", "Semir"}};

        for (String[] name : names) {
            for (String s : name) {
                System.out.println(s);
            }
        }


    }
}
