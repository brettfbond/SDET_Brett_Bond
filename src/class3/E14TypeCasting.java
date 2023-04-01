package class3;

public class E14TypeCasting {
    public static void main(String[] args) {

        short num = 1200;
        // byte num2 = num; // can't put larger into smaller type
        byte num2 = (byte) num;
        System.out.println(num2); // -80   data is lost because byte is smaller

        short num3 = 126;
        byte num4 = (byte) num3;
        System.out.println(num4); // 126   This works because the number fits inside byte
    }
}
