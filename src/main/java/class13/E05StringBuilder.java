package class13;

public class E05StringBuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Java");

        System.out.println(str.reverse()); // avaJ

        String str1 = "Computer";
        StringBuilder str2 = new StringBuilder(str1); // converts String str1 into StringBuilder
        System.out.println(str2.reverse());
        str2.reverse();
        str1 = str2.toString(); // puts StringBuilder back to String after manipulating the StringBuilder variable
        System.out.println(str1);
    }
}
