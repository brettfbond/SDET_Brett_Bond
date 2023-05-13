package class16.HWClass16;

public class HW01 {

    // Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));

        // HW02
        HW02ConstructorAccess obj = new HW02ConstructorAccess("String");
    }
}

