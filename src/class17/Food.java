package class17;

public class Food {
    String name = "Pasta";
    void printFood() {
        String name = "Burgers";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.printFood();
    }
}
