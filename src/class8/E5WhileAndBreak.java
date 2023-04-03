package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {

        // Create a boolean variable summer. Store true in it.
        // Write a loop that runs as long as it is summer. create a temp variable...

        boolean summer = true;
        int temp = 85;
        while (summer) {
            if (temp < 100) {
                System.out.println("It's good I enjoy summer");
            } else {
                System.out.println("It's very hot");
                break;
            }
            temp += 3;

        }


    }
}
