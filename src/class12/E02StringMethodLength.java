package class12;

public class E02StringMethodLength {
    public static void main(String[] args) {

        String userName = "admin";
        String password = "pass123";

        // Write code to check if username and password are less than 8 characters

        if (userName.length() <= 8 && password.length() <= 8) {
            System.out.println("Signup Successful");
        } else {
            System.out.println("Username and password can't be more than 8 characters");
        }
    }
}
