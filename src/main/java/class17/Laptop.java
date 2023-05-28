package class17;

public class Laptop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchPad;
    boolean touchScreen;

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchPad, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchPad = touchPad;
        this.touchScreen = touchScreen;


        }
    static int age(int i) {
        int a = i+1;
        return a;
    }

    public static void main(String[] args) {

        System.out.println(Laptop.age(13));
    }
}
