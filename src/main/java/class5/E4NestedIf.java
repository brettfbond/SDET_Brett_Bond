package class5;

public class E4NestedIf {
    public static void main(String[] args) {

        int money = 8000;
        String day = "Tuesday";

        if (money > 10000) {
            if (day.equals("Sunday")) {
                System.out.println("Let's go shopping");
            } else {
                System.out.println("Let's wait for Sunday");
            }
        } else {
            System.out.println("Let's save more");
        }
    }
}
