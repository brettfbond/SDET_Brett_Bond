package class13;

public class E04StringDemoSplit {
    public static void main(String[] args) {

        String str = "Today is Sunday. We have Java class. We like Java!";

        String[] strArr = str.split("[.]"); // Splits into 3 elements separated by where the periods are
        System.out.println(strArr.length); // 3 elements in the array
        System.out.println(strArr[0]); // prints the first element "Today is Sunday"

        String task = "This is a String. I hope you enjoy this String.";
        System.out.println(task.replace(" ", ""));

        String task2 = "fdslkj709809LGJOIWK)(&^%^#!#";
        String task2Alphanumeric = task2.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(task2Alphanumeric);
        System.out.println(task2Alphanumeric.length());

        String a = "Is it Saturday? Is it Raining? Do we have a Java Class today?";
        String[] arr = a.split("[.!?]");
        System.out.println(arr.length);


    }
}
