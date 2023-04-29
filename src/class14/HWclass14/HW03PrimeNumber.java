package class14.HWclass14;

public class HW03PrimeNumber {

    // Write a method to return whether given number is prime or not?

    boolean isPrime(int number) {
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && number != i) {
                prime = false;
                break;
            } else if (i == number) {
                prime = true;
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        HW03PrimeNumber obj = new HW03PrimeNumber();
        System.out.println(obj.isPrime(7919));
    }


}
