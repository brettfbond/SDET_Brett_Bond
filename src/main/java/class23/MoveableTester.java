package class23;

public class MoveableTester {
    public static void main(String[] args) {
        Moveable[] moveables = {new Cat(), new Dog()};

        for (Moveable moveable : moveables) {
            moveable.move();
        }
    }
}
