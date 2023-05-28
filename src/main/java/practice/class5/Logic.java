package practice.class5;

public class Logic {
    public static void main(String[] args) {

        boolean a = true && true && true; // true
        boolean b = !(true || false); // false
        System.out.println(a);
        System.out.println(b);

        int c = 3;
        int d = 4;
        boolean isSunny = true;
        if (c < d && isSunny) {
            System.out.println("It's going to be a good day");
        }
    }
}
