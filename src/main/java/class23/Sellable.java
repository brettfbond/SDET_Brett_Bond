package class23;

public interface Sellable {
    int PRICE = 12000; // always public static final
    void sell(); // always public abstract

    static void restock() // static methods are allowed. Must have body
    {
        System.out.println("Allowed");
    }
}
