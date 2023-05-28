package class6.HWClass6;

import java.util.Scanner;

public class HW6Languages {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your country");
        String country = scan.nextLine();

        switch (country) {
            case "USA", "Australia", "New Zealand":
                System.out.println("You speak English");
                break;
            case "Portugal", "Brazil":
                System.out.println("You speak Portuguese");
                break;
            case "Turkey":
                System.out.println("You speak Turkish");
                break;
        }
    }
}
