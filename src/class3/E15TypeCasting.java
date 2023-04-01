package class3;

public class E15TypeCasting {
    public static void main(String[] args) {

        double num = 100.5;
        // int num2 = num; // nope, need to type cast
        int num2 = (int) num;
        System.out.println(num2); // 100
    }
}
