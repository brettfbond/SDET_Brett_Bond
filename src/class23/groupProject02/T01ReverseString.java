package class23.groupProject02;
// Reverse a String: Write a function to reverse a given string. For
// example, given the input "Hello", the output should be "olleH".
public class T01ReverseString {
    String reverseStr(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse = reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        var obj = new T01ReverseString();
        System.out.println(obj.reverseStr("Hello"));
    }
}
