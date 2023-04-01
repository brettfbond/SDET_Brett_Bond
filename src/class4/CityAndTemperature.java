package class4;

import java.util.Scanner;

public class CityAndTemperature {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What city are you in?");
        String city = scan.nextLine();
        System.out.println("What is the current temperature?");
        int temp = scan.nextInt();
        System.out.println("Is that Fahrenheit or celsius?");
        char unit = scan.next().charAt(0);

        if (unit == 'F')
            temp = (temp - 32) * 5/9;

        System.out.println("The temperature in " + city + " is " + temp + " degrees celsius.");
    }
}
