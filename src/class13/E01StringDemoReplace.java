package class13;

public class E01StringDemoReplace {
    public static void main(String[] args) {

        // Find and Replace

        String str = "Batch 16 is good";
        System.out.println(str.replace("good", "Excellent"));
        System.out.println(str);
        str = str.replace("good", "Excellent");
        System.out.println(str);

        System.out.println(str.replace('e', 'E'));
    }
}
