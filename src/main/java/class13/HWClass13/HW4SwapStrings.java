package class13.HWClass13;

public class HW4SwapStrings {
    public static void main(String[] args) {

        // How would you swap  2 strings without a temporary variable?

        String a = "hotsauce";
        String b = "good";
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.print(a + " " + b);
    }
}
