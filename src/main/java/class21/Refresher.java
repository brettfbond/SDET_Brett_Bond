package class21;

public class Refresher {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        for (int i : arr) {
            System.out.println(i);
        }

        Dog dog1 = new Dog("Lal", "black", "Persian");
        Dog[] dogs = {dog1, new Dog("Papi", "white", "Chinese")};
        for (Dog dog : dogs) {
            dog.printInfo();
        }

        Animal dog2 = new Dog("Pepper", "charcoal", "lab");

    }
}
