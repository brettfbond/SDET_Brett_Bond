package class3;

public class E13TypeCasting {
    public static void main(String[] args) {

        // byte > short > int > long > float > double
        byte num = 127;
        short num2 = num; // no issues because short is larger than byte

        int num3 = 1111120;
        double num4 = num3; // Still no issues. = 1111120.0
        System.out.println(num4);

    }
}
