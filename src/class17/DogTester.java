package class17;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Jack", "black", "Persian", 12);
        Dog dog2 = new Dog("Shaggy", "white", "Huskey", 8);
        Dog dog3 = new Dog("Fluffy", "pink", "labrador", 9);
        Dog dog4 = new Dog("Pepper", "tan", "wiener", 18);

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();


        /*
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        dog1.name = "Fido";
        dog1.color = "black";
        dog1.breed = "dalmation";
        dog1.age = 9;
        dog1.printInfo();

        dog2.name = "Steve";
        dog2.color = "brown";
        dog2.breed = "bulldog";
        dog2.age = 9;
        dog2.printInfo();

        dog3.name = "Jojo";
        dog3.color = "white";
        dog3.breed = "German shepherd";
        dog3.age = 9;
        dog3.printInfo();

        dog4.name = "Pepper";
        dog4.color = "black/white";
        dog4.breed = "labrador";
        dog4.age = 9;
        dog4.printInfo();

        dog5.name = "Milo";
        dog5.color = "tan";
        dog5.breed = "catdog";
        dog5.age = 9;
        dog5.printInfo();
        */
    }
}
