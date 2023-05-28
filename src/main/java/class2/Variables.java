package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Create a Java program and name it Variables
        In your program create different type of variables to store student’s information
        (name, last name, grade, city, state, phone number) and then print value of those variables in the format:
        My name is  and my  last name is __
        I am A/B student
        I live in city and state__
        And my phone number is …..
         */
        String nameFirst = "Brett";
        String nameLast = "Bond";
        char grade = 'B';
        String city = "Seattle";
        String state = "WA";
        String phoneNumber = "999-999-9999";

        System.out.println("My name is " + nameFirst + " and my last name is " + nameLast + ".");
        System.out.println("I am now a(n) " + grade + " student.");
        System.out.println("I moved to " + city + ", " + state + ".");
        System.out.println("My new phone number is " + phoneNumber + ".");
    }
}
