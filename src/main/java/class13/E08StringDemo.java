package class13;

public class E08StringDemo {
    public static void main(String[] args) {

        String str = "1";
        for (int i = 0; i < 100; i++) {
            str += i; // better to use StringBuilder because we are changing the String variable many times
        }

        StringBuilder str2 = new StringBuilder("1");
        for (int i = 0; i < 100; i++) {
            str2.append(i); // better to use StringBuilder because we are changing the String variable many times
        }
    }
}
