package class6.HWClass6;

import java.util.Scanner;

public class HW7CalculatorSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first number");
        double num1 = scan.nextDouble();
        System.out.println("Please enter second number");
        double num2 = scan.nextDouble();
        System.out.println("Will you be adding, subtracting, multiplying, or dividing? Enter + - * /");
        char operator = scan.next().charAt(0);
        double answer = 0;

        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
        }

        String number1 = String.valueOf(num1);
        String number2 = String.valueOf(num2);

        System.out.println(number1 + " " + operator + " " + number2 + " = " + answer);
    }
}
