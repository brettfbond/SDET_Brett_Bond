package class19.HWclass19;

public class HW01Square {
    // Create 1 class in which create a methods that will calculate the area of Method
    // name must be called calculateArea
    // Rectangle
    // Square
    //
    //Use separate class to test your code

    public static double calculateArea(double side) {
        return side * 4;
    }
    public static double calculateArea(double sideA, double sideB) {
        return sideA * 2 + sideB * 2;
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println(HW01Square.calculateArea(4));
        System.out.println(HW01Square.calculateArea(3,6.5));
    }
}
