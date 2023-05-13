package class16;

import class12.Dog;

public class E01DogTester {
    public static void main(String[] args) {
        E01Dog dog1 = new E01Dog();
        dog1.breed = "German";
        dog1.color = "black";
        dog1.name = "Jack";

        E01Dog dog2 = new E01Dog();
        dog2.breed = "Persian";
        dog2.color = "White";
        dog2.name = "Sam";

        dog1.printInfo();
        dog2.printInfo();
    }
}
