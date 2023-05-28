package class12;

public class E05StringMethodIsEmpty {
    public static void main(String[] args) {

        String name = " ";
        System.out.println(name.isEmpty()); // false, because of spaces
        System.out.println(name.isBlank()); // true, ignores white space
    }
}
