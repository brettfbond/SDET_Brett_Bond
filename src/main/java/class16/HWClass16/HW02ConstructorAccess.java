package class16.HWClass16;

public class HW02ConstructorAccess {
    HW02ConstructorAccess(String str) {
        System.out.println("Default");
    }
    public HW02ConstructorAccess(int i) {
        System.out.println("Public");
    }
    private HW02ConstructorAccess(boolean b) {
        System.out.println("Private");
    }
    protected HW02ConstructorAccess() {
        System.out.println("Protected");
    }
    /*
    public static HW02ConstructorAccess(double d) {
        System.out.println("Static");
    }*/

    public static void main(String[] args) {
        HW02ConstructorAccess obj = new HW02ConstructorAccess(true);
    }
}
