package class10.GroupProject;

public class T07Fibonacci {
    public static void main(String[] args) {

        // Write a Java Program to print the first 10 numbers of Fibonacci series.
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        int fibonacciA = 0;
        int fibonacciB = 1;
        int fibonacciC;
        int a = 0;

        do {
            System.out.println(fibonacciA);
            fibonacciC = fibonacciA + fibonacciB;
            fibonacciA = fibonacciB;
            fibonacciB = fibonacciC;
            a++;
        } while (a < 10);

    }
}
