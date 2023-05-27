package class23;

public interface Moveable {
    void move();
}
interface Washable {
    void wash();
}
class Dog implements Moveable, Washable {

    @Override
    public void move() {
        System.out.println("Dog gets goin");
    }

    @Override
    public void wash() {
        System.out.println("Wash that dog");
    }
}
class Cat implements Moveable {

    @Override
    public void move() {
        System.out.println("Yeah cats move");
    }
}
class Horse {
    public void move() {
        System.out.println("Horses really move");
    }
}