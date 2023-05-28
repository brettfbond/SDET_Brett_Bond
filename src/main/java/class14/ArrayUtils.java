package class14;

public class ArrayUtils {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        ArrayUtils obj = new ArrayUtils();
        int sum = obj.add(4,6);
        System.out.println(sum);
    }
}
