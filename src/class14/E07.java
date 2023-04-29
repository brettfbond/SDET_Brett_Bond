package class14;

public class E07 {

    void isLarger(int num1, int num2) {
        if (num1 > num2) System.out.println(num1 + " is larger");
        else System.out.println(num2 + " is larger");
    }

    public static void main(String[] args) {

        E07 obj = new E07();
        obj.isLarger(13,18);
    }

}
