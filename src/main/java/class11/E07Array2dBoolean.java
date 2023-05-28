package class11;

public class E07Array2dBoolean {
    public static void main(String[] args) {

        boolean [][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}

        };
        int count = 0;
        for (boolean[] booleans : arr2D) {
            for (boolean aBoolean : booleans) {
                if (aBoolean)
                    count++;
            }
        }
        System.out.println(count);
    }
}
