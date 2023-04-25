package class12;

import java.util.Scanner;

public class TaskUsernamePassword {
    public static void main(String[] args) {

        // Store username, password and confirm password from a user and check following requirements:
        //
        // Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
        // Password should be minimum 8 characters, if less → message=”Password is too short”.
        // Password cannot contain username if so, → message=”Password cannot contain username”.
        // Password should match confirmed password, if not  → message=“Passwords do not match”.
        //
        // Only after all requirements met → message “Your username and password has been created”

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input username");
        String username = scan.next();
        System.out.println("Please input password");
        String password = scan.next();
        System.out.println("Please confirm password");
        String passwordConfirm = scan.next();

        if (username.isBlank() || password.isBlank()) {
            System.out.println("Username or Password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters");
        } else if (password.equals(username)) {
            System.out.println("Password cannot be the same as Username");
        } else if (!password.equals(passwordConfirm)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("Your Username and Password have been created");
        }
    }
}
