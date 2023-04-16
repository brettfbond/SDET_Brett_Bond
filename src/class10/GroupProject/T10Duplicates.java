package class10.GroupProject;

public class T10Duplicates {
    public static void main(String[] args) {

        // Write a program to print out duplicate elements from
        // an Array of Strings?
e
        String[] arrNames = {"John", "Samantha", "Alex", "Brett", "Samantha", "John", "Philip"};

        for (int i = 0; i < arrNames.length; i++) {
            String test = arrNames[i];
            for (int j = i + 1; j < arrNames.length; j++) {
                if (test.equals(arrNames[j])) {
                    System.out.println(test);
                }
            }
        }
    }
}
