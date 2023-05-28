package class18;

public class A {
    static void printF() {
        System.out.println("Yo");
    }

}
class B extends A {
    public static void main(String[] args) {
        printF();
    }

}
class C extends B {

}
