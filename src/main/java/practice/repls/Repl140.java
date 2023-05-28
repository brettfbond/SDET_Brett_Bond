package practice.repls;

public class Repl140 {

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

    static String maxLength(String[] arr) {
        String max = arr[0];
        for (String s : arr) {
            if (s.length() > max.length()) max = s;
        }
        return max;
    }
}
